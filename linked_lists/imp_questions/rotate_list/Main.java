package linked_lists.imp_questions.rotate_list;

public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(1);

        head.insert(head, 2);
        head.insert(head, 3);
        head.insert(head, 4);
        head.insert(head, 5);

        head.display(head);

        ListNode newHead = head.rotateRight(head, 2);

        newHead.display(newHead);
    }
}
