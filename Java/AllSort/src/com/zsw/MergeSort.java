package com.zsw;

public class MergeSort {

    private static Comparable[] aux;

    public static void Main(){
        System.out.println("--------------------归并排序--------------------------");
        Comparable[] a = {1,7,4,2,3,9,6,8,5};
        sort(a);
        for(Comparable i:a) {
            System.out.println(i);
        }
    }

    public static void sort(Comparable[] a){
        aux = new Comparable[a.length];
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[]a, int lo, int hi){
        // 将数组a[lo..hi]排序
        if(hi<=lo) return;
        int mid = lo + (hi - lo)/2;
        sort(a,lo,mid); //左半边排序
        sort(a,mid+1,hi); //右半边排序
        merge(a,lo,mid,hi);   //归并结果
        System.out.println("lo:"+lo+"   mid:"+mid+"   hi:"+hi);
    }
    public static void merge(Comparable[]a, int lo, int mid,int hi){
        //将a[lo..mid] 和a[mid+1..hi] 归并
        int i = lo, j= mid+1;

        // 将a[lo..hi]复制到aux[lo..hi] ，需要额外的一个存储空间
        for(int k = lo;k<= hi;k++){
            aux[k] = a[k];
        }

        // 开始归并到a[lo..hi]
        for(int k=lo;k<=hi;k++){
            if(i>mid){      // 左边到头了, 用右边的元素继续
                a[k] = aux[j++];
            }else if(j > hi){       // 右边到头了 ，用左边的元素继续
                a[k] = aux[i++];
            }else if(less(aux[j] ,aux[i])){   // 右边的元素比较小，用右边的
                a[k] = aux[j++];
            }else {
                a[k] = aux[i++];            // 不用做啥
            }
        }
    }

    // 进行一下判断是否小于
    private static boolean less(Comparable a, Comparable b){
        boolean re = false;
        if (a.compareTo(b)<0)
            re = true;
        return re;
    }


}
