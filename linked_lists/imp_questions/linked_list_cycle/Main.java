package linked_lists.imp_questions.linked_list_cycle;

public class Main {

    public static void main(String[] args){
        ListNode head = new ListNode(1);

        ListNode cycleNode = head.insert(head, 2);
        head.insert(head, 3);
        ListNode tail = head.insert(head, 4);

        tail.setNext(cycleNode);

        // System.out.println(head.hasCycle(head));
        System.out.println(head.cycleLength(head));
    }
}
