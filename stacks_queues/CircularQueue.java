package stacks_queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int front = -1;
    int end = -1;

    public CircularQueue(){
        this(DEFAULT_SIZE); // calling the another constructor
    }
    
    public CircularQueue(int size){
        data = new int[size];
    }

    public boolean isOverflowed(){
        return end == data.length-1 && front == ((end+1) % data.length);
    } 

    public boolean isEmpty(){
        return end == -1;
    }

    public boolean insert(int ele){
        if(isOverflowed()){
            System.out.println("\nThe Queue is Overflowed");
            return false;
        }

        if(end == -1){
            front = 0;
        }

        end = (end+1) % data.length;

        data[end] = ele;
        return true;
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("The Queue is Empty!");
        }

        int removedItem = data[front];
        if(front == end){
            front = -1;
            end = -1;
        }else{
            front = (front+1) % data.length;
        }

        return removedItem;
    }

    public int front() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot return front from a empty queue!");
        }   

        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("\nThe Queue is Empty");
            return;
        }

        for(int i = front; i!=end; i = (i + 1) % data.length){
            System.out.printf("%d -> ", data[i]);
        }

        System.out.printf("%d -> END\n", data[end]);
    }
}
