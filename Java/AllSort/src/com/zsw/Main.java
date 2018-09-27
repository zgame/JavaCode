package com.zsw;


import java.util.*;
//import com.zsw.BinarySearch;
import static java.lang.System.out;
import static jdk.internal.org.objectweb.asm.Type.getType;

public class Main {

    public static void main(String[] args) {

        out.println("---------run------------");


//        BinarySearch.binarySearch2();
//        BinarySearch.binarySearch();
//        mtest.test1();
//        SelectionSort.Sort();
//        InsertSort.Sort();
//        ShellSort.main(null);
//        MergeSort.Main();
//        QuickSort.Main();
        HeapSort.Main();
    }
}

class mtest{
    static void test1(){
        Stack<Integer> ss = new Stack<Integer>();
        ss.push(1);
        ss.push(3);
        ss.push(5);
        ss.push(8);
        ss.pop();
        ss.pop();

        for ( Integer i : ss) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------");
        Queue<String> ss2 = new LinkedList<String>();
        ss2.offer("ssssss0");
        ss2.offer("ssssss1");
        ss2.offer("ssssss2");
        ss2.offer("ssssss3");

        ss2.poll();
        System.out.println(ss2);
        System.out.println(((LinkedList<String>) ss2).get(2));
        for ( String i : ss2) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------------------");

        Map mm = new HashMap();
        mm.put(1,"ss");
        mm.put(2,"ss2");
        mm.put(3,"ss3");

        mm.remove(2);
        System.out.println(mm);


        LinkedList<String> ll = new LinkedList<String>();
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.remove("1");
        ll.addFirst("-1");
        System.out.println(ll.get(1));


        Vector<String> vv = new Vector<>();
        vv.add("sss");
        vv.add("sss1");
        vv.remove("sss");
        System.out.println(vv);


        ArrayList<Integer> aa = new ArrayList<>();
        aa.add(1);
        aa.add(2);
        aa.add(3);
        aa.add(3);
        aa.remove(new Integer(1));
        System.out.println(aa);

        System.out.println("------------------------------------------------------");

    }
}
