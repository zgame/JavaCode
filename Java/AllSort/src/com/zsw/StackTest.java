package com.zsw;

import java.util.Stack;

public class StackTest {

    public static void Main(){
        stackReverse();
    }


    //用递归函数和栈，逆序一个栈
    private static void stackReverse(){
        Stack<Integer> ss = new Stack<Integer>();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);
        ss.push(5);

        System.out.println(ss);
        //递归函数
        reverse(ss);

        System.out.println(ss);
    }
    private static int getAndRemoveLastElement(Stack<Integer> a){
        int result = a.pop();
        if (a.isEmpty()){
            System.out.println("is empty "+result);
//            a.push(result);
            return result;
        }else {
            int last = getAndRemoveLastElement(a);
            a.push(result);
            System.out.println(result);
            return last;
        }
    }

    private static void reverse(Stack<Integer> a){
        if (a.isEmpty()){
            return;
        }
        int i = getAndRemoveLastElement(a);
        reverse(a);
        a.push(i);
        System.out.println("reverse---"+i);
    }

}
