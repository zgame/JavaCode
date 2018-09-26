package com.zsw;

import static java.lang.System.out;

public class BinarySearch {


    //-----------------------------------------------------------------------
    // 二分查找法 递归

//-----------------------------------------------------------------------
    public static void binarySearch2() {
        out.println("--------二分查找法递归实现-------");
        final int find = 1;

        int[] aaa = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int low = 0;
        int high = aaa.length - 1;
        binarySearch2_loop(aaa, low, high, find);
    }

    static void binarySearch2_loop(int[] aa, int low, int high, int find) {
        int now = low + (high - low) / 2;
        if (aa[now] == find) {
            out.println("find: " + now);
            return;
        }
        if (aa[now] > find) {
            out.println("now: " + now);
            binarySearch2_loop(aa, low, now - 1, find);
        } else {
            out.println("now: " + now);
            binarySearch2_loop(aa, now + 1, high, find);
        }
    }


    //-----------------------------------------------------------------------
    // 二分查找法 while
//-----------------------------------------------------------------------
    public static void binarySearch() {
        out.println("---------二分查找法 while 循环----------");
        final int find = 1;

        int[] aaa = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int low = 0;
        int high = aaa.length - 1;
        int now = (high - low) / 2;

        if (find > aaa[high] || find < aaa[low]) {
            out.println("超过界限了，找不到的！");
            return;
        }

        while (low <= high) {
            now = (high - low) / 2 + low;
            if (find < aaa[now]) {
                high = now - 1;
                out.println("now " + now);
                out.println("high " + high);
            } else if (find > aaa[now]) {
                low = now + 1;
                out.println("now " + now);
                out.println("low " + low);
            } else if (find == aaa[now]) {
                out.println("find:  " + find + " in position: " + now);
                return;
            }
        }

    }

}
