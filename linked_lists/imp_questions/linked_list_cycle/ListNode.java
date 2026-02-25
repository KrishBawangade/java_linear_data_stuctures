package linked_lists.imp_questions.linked_list_cycle;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

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

    public boolean hasCycle(ListNode head) {
        ListNode fast = head, slow = head;

        while(fast!=null){
            int i=2;

            // moving fast pointer ahead by 2 pos
            while(fast!=null && i>0){
                fast = fast.next;
                i--;
            }

            // moving slow pointer ahead by 1 pos
            slow = slow.next;

            if(fast!= null && fast == slow){
                return true;
            }
        }

        return false;
    }

    public int cycleLength(ListNode head){
        ListNode fast = head, slow = head;
        int length = 0;

        while(fast!=null){
            int i=2;

            // moving fast pointer ahead by 2 pos
            while(fast!=null && i>0){
                fast = fast.next;
                i--;
            }

            // moving slow pointer ahead by 1 pos
            slow = slow.next;

            if(fast!= null && fast == slow){
                break;
            }
        }

        if(fast!=null && fast == slow){
            do{
                slow = slow.next;
                length++;
            }while(fast != slow);
        }

        return length;
    }

    public void setNext(ListNode next){
        this.next = next;
    }
}
