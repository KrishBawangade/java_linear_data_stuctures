package linked_lists.imp_questions.sort_list;

public class Main {

    public static void main(String[] args){
        ListNode head = new ListNode(23);

        head.insert(head, 34);
        head.insert(head, 5);
        head.insert(head, 67);
        head.insert(head, 2);

        head.display(head);

        ListNode sorted = head.sortList(head);

        sorted.display(sorted);
    }
    
}
