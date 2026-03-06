package stacks_queues;

public class CustomStackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack();

        // stack.pop(); Throws an exception as stack is Empty

        stack.push(10);
        stack.push(2);
        stack.push(45);
        stack.push(23);
        stack.push(9);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
