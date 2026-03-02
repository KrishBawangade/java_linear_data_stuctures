package linked_lists.imp_questions.palindrome_list;

public class Main {
    public static void main(String[] args){
        ListNode head = new ListNode(1);

        head.insert(head, 2);
        head.insert(head, 2);
        head.insert(head, 1);

        head.display(head);

        System.out.println(head.isPalindrome(head));
    }
}
