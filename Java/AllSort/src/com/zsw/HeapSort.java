package com.zsw;

public class HeapSort {

//    private static int[]a =  {0,1,7,4,2,3,9,6,12,8,5,10};
    public static void Main(){
        System.out.println("-------------堆排序--------------");
        int[] a = {0,1,7,4,2,3,9,6,12,8,5,10};
        sort(a);
        for(int i:a) {
            System.out.println(i);
        }
    }

    public static void sort(int[] a){
        int N= a.length;
        for(int k=N/2;k>=1;k--){
            sink(a,k,N);
        }
        while (N>1){
            exch(a,1,N--);
            sink(a,1,N);
        }

    }

    private static void sink(int[]a,int k, int N)	//下沉
    {
        while(2*k <= N)
        {
            int j = 2*k;
            if(j<N && less(a,j,j+1)) j++;
            if(!less(a,k,j))break;
            exch(a,k,j);
            k = j;
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
