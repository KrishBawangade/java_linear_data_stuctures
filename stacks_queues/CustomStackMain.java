package stacks_queues;

public class CustomStackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack();

        DynamicStack dStack = new DynamicStack(5);

        // stack.pop(); Throws an exception as stack is Empty

        // stack.push(10);
        // stack.push(2);
        // stack.push(45);
        // stack.push(23);
        // stack.push(9);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());

        dStack.push(23);
        dStack.push(5);
        dStack.push(6);
        dStack.push(43);
        dStack.push(87);
        dStack.push(2);
        dStack.push(78);

        dStack.pop();
        dStack.pop();

        dStack.push(34);

        System.out.println(dStack.pop());
        System.out.println(dStack.pop());
        System.out.println(dStack.peek());

    }
}
