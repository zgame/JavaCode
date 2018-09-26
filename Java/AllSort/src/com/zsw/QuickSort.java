package com.zsw;

public class QuickSort {
    public static void Main(){
        System.out.println("-------------快排--------------");
        Comparable[] a = {1,7,4,2,3,9,6,12,8,5,0};
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
        sort(a,lo,j-1);     //将左半部分a[lo..j-1]排序
        sort(a,j+1,hi);     //将右半部分a[j+1..hi]排序
    }
}















