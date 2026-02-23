package linked_lists.imp_questions.remove_duplicate_from_sorted;

public class Main {

    public static void main(String[] args){
        ListNode head = new ListNode(34);

        head.insert(head, 3);
        head.insert(head, 23);
        head.insert(head, 23);
        head.insert(head, 23);
        head.insert(head, 45);
        head.insert(head, 45);

        head.deleteDuplicates(head);

        head.display(head);
    }
}
