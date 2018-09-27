package com.zsw;

public class QuickSort {
    public static void Main(){
        System.out.println("-------------快排--------------");
        Comparable[] a = {0,1,7,4,2,3,9,6,12,8,5,10};
        sort(a);
        for(Comparable i:a) {
            System.out.println(i);
        }
    }

    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }
    private static void sort(Comparable[] a,int lo, int hi){
        if(hi<=lo) return;
        int j = partition(a,lo,hi);   //切分
        System.out.println("lo:"+lo+"        hi:"+hi+"       j:"+j);
        sort(a,lo,j-1);     //将左半部分a[lo..j-1]排序
        sort(a,j+1,hi);     //将右半部分a[j+1..hi]排序
    }

    private static int partition(Comparable[]a, int lo, int hi){
        //将数组切分为a[lo..i-1], a[i], a[i+1..hi]
        int i = lo, j=hi+1;   //左右扫描指针
        Comparable v = a[lo];   // 切分元素
        while(true){
            //扫描左右， 检查扫描是否结束并交换元素
            while (less(a[++i],v)){
                if(i==hi)break;      //从左往右扫描，找到比切分元素大的就停止,a[i]就是大的元素
            }
            while (less(v,a[--j])){
                if(j==lo)break;      // 从右往左扫描， 找到比切分元素小的就停止,a[j]就是小的元素
            }
            if(i>=j){
                break;      // 大的a[i]本来就在右边了，不用管了
            }
            exch(a,i,j);        // 如果有，那么一直不停的交换 大的a[i]和 小的a[j]
        }
        exch(a,lo,j);   // 将切分元素和比较小的a[j]交换一下
        return j;       // a[lo..j-1] <= a[j] <= a[j+1..hi]达成
    }

    public static boolean less(Comparable a,Comparable b){
        boolean re = false;
        if(a.compareTo(b)<0){
            re = true;
        }
        return re;
    }
    public  static void exch(Comparable[]a,int x, int y){
        Comparable temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

}















