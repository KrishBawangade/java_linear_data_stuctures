package linked_lists.imp_questions.remove_duplicate_from_sorted;


public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void insert(ListNode head, int val){
        ListNode temp = head;
        ListNode node = new ListNode(val);

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = node;
    }

    public void display(ListNode head){
        ListNode temp = head;

        while(temp!=null){
            System.out.printf("%d -> ", temp.val);
            temp = temp.next;

            if(temp == null){
                System.out.print("End");
            }
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode prev = temp;

        while(temp!=null){
            if(prev != temp && prev.val == temp.val){
                prev.next = temp.next;
                temp = temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
}