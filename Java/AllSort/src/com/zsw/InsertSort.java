package com.zsw;

import java.util.Vector;

import static java.lang.System.out;

//------------------------------------------------------------------
// 插入排序
// 依次把右边的数跟左边的数进行比较， 如果小于左边的数，那么就插入到左边数的位置上，  因为插入之后就进行下一个数字遍历了，所以次数要少一些。
//------------------------------------------------------------------


public class InsertSort {

    public static void Sort(){
        out.println("--------插入排序方法-------");
        int[] aaa = { 20, 15, 0, 1, 2, 3, 4, 5, 6, 7};

        Vector<Integer> re = new Vector<>();
        int AllNum = 0;

        for (int anAaa : aaa) {
            re.add(anAaa);
        }

        for(int i=1;i<re.size();i++){
            int min = re.get(i);
            for(int j=0;j<i;j++){
                if (min < re.get(j)){
                    //插入
                    re.remove(i);
                    re.add(j,min);
                    AllNum++;
                    break;
                }
            }
        }
        System.out.println(re);
//        for (Integer i:re) {
//            System.out.println(i);
//        }
        System.out.println("总循环次数："+ AllNum);
        int lenn = aaa.length  ;
        System.out.println("计算总循环次数："+  lenn*lenn /2);

    }
}
