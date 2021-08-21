package utility;

import utility.MyStack;

public class FinalProject {
    private MyStack currentStack ;
    private MyStack popStack;

    public FinalProject(MyStack<String> currentStack, MyStack<String> popStack ) {
        this.currentStack    = currentStack;
        this.popStack        = popStack;
    }

    public FinalProject(){
        this(null,null);
    }

    public void undo(){
        if(currentStack.isEmpty()) {
            String message = "Your file is empty. We cannot undo anything. ";
            throw new IndexOutOfBoundsException(message);
        } else {
            String popValue = (String) currentStack.pop();
            popStack.push(popValue);
        }
    }

    public void redo() {
        if (popStack.isEmpty()) {
            String message = "We already redo all your requests.";
            throw new NullPointerException(message);
        } else {
            String redoValue = (String) popStack.pop();
            currentStack.push(redoValue);
        }
    }
//        public void redo() {
//            String redoValue = (String) popStack.pop();
//            currentStack.push(redoValue);
//       }
}

//    public boolean checkEmpty(MyStack stack){
//        return stack.isEmpty();
//    }

//     for testing???
//     input.toLowerCase();
//        if (input.equals("u")){
//            String popValue = currentStack.pop();
//            PopStack.push(popValue);
//        }