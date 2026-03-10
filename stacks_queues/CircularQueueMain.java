package stacks_queues;

public class CircularQueueMain {
    public static void main(String[] args) throws QueueException{
        CircularQueue queue = new CircularQueue(5);

        queue.insert(34);
        queue.insert(23);
        queue.insert(4);
        queue.insert(6);
        queue.insert(90);

        System.out.println(queue.remove());

        queue.insert(3);

        System.out.println(queue.front());

        queue.display();
    }
}
