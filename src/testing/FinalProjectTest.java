package testing;
import utility.MyStack;
import utility.FinalProject;

public class FinalProjectTest {
    public static void main(String[] args) {
        MyStack<String> stack       = new MyStack<>();
        MyStack<String> popStack    = new MyStack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        //FinalProject.undo();
        FinalProject testProj = new FinalProject(stack, popStack);
        System.out.println(stack);
        testProj.undo();
        System.out.println(stack);
//        testProj.undo();
//        System.out.println(stack);
//        testProj.undo();
//        System.out.println(stack);
//        testProj.undo();
//        System.out.println(stack);
//        testProj.redo();
//        System.out.println(stack);
        testProj.redo();
        System.out.println(stack);
        testProj.redo();
        System.out.println(stack);
        testProj.redo();
        System.out.println(stack);
        testProj.redo();
        System.out.println(stack);

    }
}
