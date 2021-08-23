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
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        //test push
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
//        stack.push("Green");
//        stack.push("Blue");
//        stack.push("Indigo");
//        stack.push("Violet");

        // test pop
        System.out.println("************Test pop**************");
        System.out.println();
        System.out.println("----------original-----------");
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println("----------1st pop-----------");
        System.out.println("Pop element" + stack.pop());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println("----------2nd pop-----------");
        System.out.println("Pop element" + stack.pop());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println("----------3rd pop-----------");
        System.out.println("Pop element" + stack.pop());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);

        //test peek
        System.out.println("************Test peek**************");
        stack1.push("Red");
        stack1.push("Orange");
        stack1.push("Yellow");
        System.out.println(stack1);
        System.out.println("peek element: " + stack1.peek());
        System.out.println();


        //test push
        System.out.println("************Test push**************");
        System.out.println(stack2.push("Red"));
        System.out.println(stack2.push("Indigo"));
        System.out.println(stack2.push("Violet"));
        System.out.println(stack2);
        System.out.println();
    }

    public static void myVersionTest(){
        System.out.println();
        System.out.println("------------ M Y   S T A C K --------------");
        MyStack<String> stack = new MyStack<>();
        MyStack<String> stack1 = new MyStack<>();
        MyStack<String> stack2 = new MyStack<>();
        //test push
        stack.push("Red");
        stack.push("Orange");
        stack.push("Yellow");
//        stack.push("Green");
//        stack.push("Blue");
//        stack.push("Indigo");
//        stack.push("Violet");

        // test pop
        System.out.println("************Test pop**************");
        System.out.println();
        System.out.println("----------original-----------");
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println("----------1st pop-----------");
        System.out.println("Pop element: " + stack.pop());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println("----------2nd pop-----------");
        System.out.println("Pop element: " + stack.pop());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);
        System.out.println("----------3rd pop-----------");
        System.out.println("Pop element: " + stack.pop());
        System.out.println("isEmpty? " + stack.isEmpty());
        System.out.println("size: " + stack.size());
        System.out.println(stack);

        //test peek
        System.out.println("************Test peek**************");
        stack1.push("Red");
        stack1.push("Orange");
        stack1.push("Yellow");
        System.out.println(stack1);
        System.out.println("peek element: " + stack1.peek());
        System.out.println();


        //test push
        System.out.println("************Test push**************");
        System.out.println(stack2.push("Red"));
        System.out.println(stack2.push("Indigo"));
        System.out.println(stack2.push("Violet"));
        System.out.println(stack2);
        System.out.println();
    }

    public static int removeMin(MyStack stack){
        return 0;
    }

    public static void removeMinTest(){
        System.out.println();
        System.out.println("------------ R E M O V E   M I N --------------");
    }

    public static void queueToStack(MyQueue<Integer> queue, MyStack<Integer> stack){
        MyQueue<Integer> queueCopy = new MyQueue<>();
        while(!queue.isEmpty()) {
            int item = queue.remove();
            stack.push(item);
            queueCopy.add(item);
        }
        while (!queueCopy.isEmpty()){
            int item = queueCopy.remove();
            queue.add(item);
        }
    }

    public static void stackToQueue(MyStack<Integer> stack, MyQueue<Integer> queue){
        MyStack<Integer> stackCopy = new MyStack<>();
        while(!stack.isEmpty()) {
            int item = stack.pop();
            queue.add(item);
        }
        while (!stackCopy.isEmpty()){
            int item = stackCopy.pop();
            queue.add(item);
        }
    }

    public static void main(String[] args) {
        intro();
        libraryVersionTest();
        myVersionTest();

    }
}

