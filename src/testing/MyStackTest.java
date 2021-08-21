package testing;

import java.util.Stack;

import utility.MyQueue;
import utility.MyStack;

public class MyStackTest {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t S T A C K    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }

    public static void libraryVersionTest(){
        System.out.println();
        System.out.println("------------ L I B R A R Y   S T A C K  --------------");
        Stack<String> stack = new Stack<>();

        //test push
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Indigo");
        stack.push("Violet");

        // test pop
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        //test peek
        System.out.println(stack.peek());
        System.out.println(stack);

        //test push
        System.out.println(stack.push("Red"));
        System.out.println(stack.push("Indigo"));
        System.out.println(stack.push("Violet"));
        System.out.println(stack);
    }

    public static void myVersionTest(){
        System.out.println();
        System.out.println("------------ M Y   S T A C K --------------");
        MyStack<String> stack = new MyStack<>();

        //test push
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
        stack.push("Green");
        stack.push("Blue");
        stack.push("Indigo");
        stack.push("Violet");

        // test pop
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        //test peek
        System.out.println(stack.peek());
        System.out.println(stack);

        //test push
        System.out.println(stack.push("Red"));
        System.out.println(stack.push("Indigo"));
        System.out.println(stack.push("Violet"));
        System.out.println(stack);
    }

    public static int removeMin(MyStack stack){
        return 0;
    }

    public static void removeMinTest(){
        System.out.println();
        System.out.println("------------ R E M O V E   M I N --------------");
    }

    public static void queueToStack(MyQueue queue, MyStack stack){ }

    public static void stackToQueue(MyStack stack, MyQueue queue){ }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();

    }
}

