package stacks_queues;

public class DynamicQueue extends CircularQueue {

    public DynamicQueue(){
        super(); // calling the parent class constructor 
    }
    
    public DynamicQueue(int size){
        super(size); // calling the parent class constructor with size
    }

    @Override
    public boolean insert(int ele) throws QueueException{
        if(this.isOverflowed()){
            // double the array size if it is overflowed
            int[] newList = new int[data.length * 2];

            int i=front;
            int j = 0;
            do{ 
                newList[j] = data[i];
                i = (i+1) % data.length;
                j++;
            }while(i!=end);
            
            newList[j] = data[i];

            data = newList;
            end = j;
            front = 0;
        }

        return super.insert(ele);
    }


}
