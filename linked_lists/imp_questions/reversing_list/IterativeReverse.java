package linked_lists.imp_questions.reversing_list;

public class IterativeReverse {
    public static void main(String[] args){
        ListNode head = new ListNode(1);

        head.insert(head, 2);
        head.insert(head, 3);
        head.insert(head, 4);
        head.insert(head, 5);

        head.display(head);

        // ListNode reversedHead = head.reverseList(head);
        
        // reversedHead.display(reversedHead);

        head.reverseBetween(head, 2, 4);

        head.display(head);
    }
}
