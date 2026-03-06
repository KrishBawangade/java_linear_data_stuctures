package stacks_queues;

import java.util.Stack;

public class BuiltInStack {
    public static void main(String[] args){
        Stack<Integer> s1 = new Stack<>();

        s1.push(23);
        s1.push(2);
        s1.push(78);
        s1.push(45);

        while(!s1.isEmpty()){
            System.out.print(s1.pop()+" ");
        }
    }
}
