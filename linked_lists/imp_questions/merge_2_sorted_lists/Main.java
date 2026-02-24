package linked_lists.imp_questions.merge_2_sorted_lists;

public class Main {

    public static void main(String[] args){
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);

        head1.insert(head1, 2);
        head1.insert(head1, 4);

        head2.insert(head2, 3);
        head2.insert(head2, 4);

        head1.display(head1);

        head2.display(head2);

        ListNode mergedHead = head1.mergeTwoList(head1, head2);

        mergedHead.display(mergedHead);
    }
}
