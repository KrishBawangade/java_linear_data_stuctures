package stacks_queues;

public class DynamicStack extends CustomStack{

    public DynamicStack(){
        super(); // calling the another constructor
    }
    
    public DynamicStack(int size){
       super(size);
    }

    @Override
    public boolean push(int ele){
        if(this.isOverflowed()){
            // double the array size if it is overflowed
            int[] newList = new int[data.length * 2];

            for(int i=0; i<=top; i++){
                newList[i] = data[i];
            }

            data = newList;
        }

        return super.push(ele); // push normally as we have already increased the size if overflowed
    }
}
