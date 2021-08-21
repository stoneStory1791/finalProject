package testing;

import utility.MyQueue;
import utility.MyStack;

import java.util.Queue;
import java.util.LinkedList;

public class MyQueueTest {

    public void evensBeforeOdds(MyQueue queue) {}

    public static void evensBeforeOddsTest(){
        System.out.println();
        System.out.println("------------ E V E N   B E F O R E   O D D S  --------------");
    }

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t Q U E U E    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void libraryVersionTest(){
        System.out.println();
        System.out.println("------------ L I B R A R Y   Q U E U E --------------");
        Queue<String> queue = new LinkedList<>();

        //test add
        queue.add("Red");
        queue.add("Orange");
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Blue");
        queue.add("Indigo");
        queue.add("Violet");

        //test remove
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        //test peek
        System.out.println(queue.peek());
        System.out.println(queue);

    }

    public static void myVersionTest(){
        System.out.println();
        System.out.println("------------ M Y   Q U E U E --------------");
        MyQueue<String> queue = new MyQueue<>();

        //test add
        queue.add("Red");
        queue.add("Orange");
        queue.add("Yellow");
        queue.add("Green");
        queue.add("Blue");
        queue.add("Indigo");
        queue.add("Violet");

        //test remove
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);

        //test peek
        System.out.println(queue.peek());
        System.out.println(queue);
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();
    }
}
