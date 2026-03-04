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

        ListNode newHead = head.reverseKGroup(head, 3);

        newHead.display(newHead);
    }
}
