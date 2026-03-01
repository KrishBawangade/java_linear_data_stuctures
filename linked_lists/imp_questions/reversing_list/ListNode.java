package linked_lists.imp_questions.reversing_list;

public class ListNode {
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

    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }

        ListNode prev = null;
        ListNode first = head;
        ListNode second = first.next;
        ListNode temp = second.next;

        while(true){
            first.next = prev;
            second.next = first;

            if(temp == null){
                return second;
            }else{
                prev = second;
            }

            if(temp.next == null){
                temp.next = prev;
                return temp;
            }else{
                first = temp;
                temp = temp.next;
                first.next = prev;
            }

            if(temp.next == null){
                temp.next = first;
                return temp;
            }else{
                second = temp;
                temp = temp.next;
                second.next = first;
            }

        }

    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }

        ListNode prev = null;
        ListNode current = head;

        for(int i=0; current!=null && i<left-1; i++){
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse the list in between
        ListNode next = current.next;
        for(int i=0; current!=null && i<(right-left+1); i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
        }

        if(last!=null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = current;

        return head;
    }
}
