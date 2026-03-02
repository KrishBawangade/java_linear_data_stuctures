package linked_lists.imp_questions.palindrome_list;

public class ListNode{
    int val;
    ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void setNext(ListNode next){
        this.next = next;
    }

    public int getVal(){
        return this.val;
    }

    public ListNode insert(ListNode head, int val){
        ListNode temp = head;
        ListNode node = new ListNode(val);

        while(temp.next!=null){
            temp = temp.next;
        }

        temp.next = node;

        return node;
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
        System.out.println();
    }

    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseFromMid(ListNode node) {

        ListNode prev = null;
        ListNode current = node.next;
        ListNode newEnd = node.next;

        // reverse the list
        ListNode next = current.next;

        while(current!=null){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }

        node.next = prev;
        newEnd.next = null;

        return prev;
    }



    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }

        ListNode mid = middleNode(head);
        ListNode newMid = reverseFromMid(mid);

        ListNode first = head;
        ListNode second = newMid;

        while(first!=null && second!=null){
            if(first.val != second.val){
                return false;
            }

            first = first.next;
            second = second.next;
        }

        return true;
    }
}