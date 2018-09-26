package com.zsw;

import java.util.Vector;

import static java.lang.System.out;

//------------------------------------------------------------------
// 选择排序
// 第一次找最小的， 第二次找第二小的。。。 遍历次数多，每次都要遍历完整
//------------------------------------------------------------------


public class SelectionSort {

    public static void Sort(){
        out.println("--------选择排序方法-------");
        int[] aaa = {20, 15, 0, 1, 2, 3, 4, 5, 6, 7};

        //Vector<Integer> re = new Vector<>();
        int AllNum = 0;

        for(int i=0;i<aaa.length;i++){
            int min = aaa[i];
            int index = i;
            for(int j=i+1;j<aaa.length;j++){
                if (aaa[j]< min){
                    min = aaa[j];
                    index = j;
                }
                AllNum++;
            }
            if(index!=i){
                //交换
                int temp = aaa[i];
                aaa[i] = aaa[index];
                aaa[index] = temp;
            }
        }
        for (Integer i:aaa) {
            System.out.println(i);
        }
        System.out.println("总循环次数："+ AllNum);
        int lenn = aaa.length  ;
        System.out.println("计算总循环次数："+  lenn*lenn /2);

    }
}
