package seminars;

public class seminar4MyStack {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        System.out.println(myStack.size());
        myStack.push(22);
        myStack.push(25);
        myStack.push(12);
        System.out.println(myStack);

        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
    }
    
}
