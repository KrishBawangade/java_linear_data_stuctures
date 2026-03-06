package stacks_queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int top = -1;

    public CustomStack(){
        this(DEFAULT_SIZE); // calling the another constructor
    }
    
    public CustomStack(int size){
        data = new int[size];
    }

    public boolean isOverflowed(){
        return top == data.length-1;
    } 

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean push(int ele){

        if(isOverflowed()){
            System.out.println("\nThe Stack is overflowed!");
            return false;
        }

        top++;
        data[top] = ele;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("The Stack is Empty!");
        }

        // int ele = data[top];
        // top--;

        return data[top--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from a empty stack!");
        }   

        return data[top];
    }
}