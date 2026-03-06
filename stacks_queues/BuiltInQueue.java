package stacks_queues;

import java.util.Queue;
import java.util.LinkedList;

public class BuiltInQueue {
    public static void main(String[] args){
        Queue<Integer> q1 = new LinkedList<>();

        q1.add(44);
        q1.add(4);
        q1.add(67);
        q1.add(12);

        System.out.println(q1.remove());
        System.out.println(q1.remove());
    }
}
