package com.zsw;

public class HeapSort {

//    private static int[]a =  {0,1,7,4,2,3,9,6,12,8,5,10};
    public static void Main(){
        System.out.println("-------------堆排序--------------");
        int[] a = {999,1,7,4,2,3,9,6,12,8,5,10,15};
        pl(a);
        sort(a);

    }

    private static void pl(int[] a){
        System.out.println("---------------------------");
        for(int i:a) {
            System.out.printf("%d  ",i);
        }
        System.out.println();
    }

    public static void sort(int[] a){
        int N= a.length-1;                //要排序的长度
        for(int k=N/2;k>=1;k--){        // 首先要制造大顶堆
            sink(a,k,N);                // 遍历一半的数据，k是孩子节点
        }
        pl(a);
        while (N>1){
            exch(a,1,N--);          // 把最大的顶点a[1]跟最后的元素（最小的）进行交换， 这样最大的值就放在最后了，然后将最大值排除
            sink(a,1,N);            // 用排除了最大值的剩余部分再组成新的大顶堆，循环往复
        }
        pl(a);
    }

    private static void sink(int[]a,int k, int N)	//下沉成大顶堆
    {
        while(2*k <= N)     // k是父节点
        {
            int j = 2*k;                            // j为最后一个孩子节点
            if(j<N && less(a,j,j+1)){           // 如果右孩子大于左孩子，j变成右孩子
                j++;
            }
            if(less(a,j,k)){           //如果孩子节点a[j]小于父节点a[k], 那么就对了
                break;
            }
            exch(a,k,j);   // 如果孩子节点a[j]大于父节点a[k] ，那么交换位置，孩子节点上浮
            k = j;         // 父节点变更为孩子节点，开始向下继续沉
        }
    }

    public static boolean less(int[]a,int x,int y){
        return a[x]<a[y];
    }
    public  static void exch(int []a,int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }


    private static void swim(int[]a,int k)		//上浮，跟父结点进行交换
    {
        while(k>1 && less( a,k/2,k))
        {
            exch(a,k/2,k);		// k/2是父结点
            k= k/2;
        }
    }
}
