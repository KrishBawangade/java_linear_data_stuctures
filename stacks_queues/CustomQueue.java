package stacks_queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;

    public CustomQueue(){
        this(DEFAULT_SIZE); // calling the another constructor
    }
    
    public CustomQueue(int size){
        data = new int[size];
    }

    public boolean isOverflowed(){
        return end == data.length-1;
    } 

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean insert(int ele){
        if(isOverflowed()){
            System.out.println("\nThe Queue is overflowed!");
            return false;
        }

        data[++end] = ele;
        return true;
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("The Queue is Empty!");
        }

        int removedItem = data[0];

        for(int i=0; i<data.length-1; i++){
            data[i] = data[i+1];
        }
        end--;
        return removedItem;
    }

    public int front() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot return front from a empty queue!");
        }   

        return data[0];
    } 

    public void display(){
        if(isEmpty()){
            System.out.println("\nThe Queue is Empty!");
            return;
        }

        for(int i=0; i<=end; i++){
            System.out.print(data[i]+" ");
        }
    }

}
