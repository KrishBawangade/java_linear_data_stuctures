package linked_lists.imp_questions.reverse_k_group;

public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(1);

        head.insert(head, 2);
        head.insert(head, 3);
        head.insert(head, 4);
        head.insert(head, 5);
        head.insert(head, 6);
        head.insert(head, 7);
        head.insert(head, 8);

        head.display(head);

        // ListNode newHead1 = head.reverseKGroup(head, 3);
        // newHead1.display(newHead1);

        ListNode newHead2 = head.reverseAlternateKGroup(head, 2);
        newHead2.display(newHead2);
    }
}
