package linked_lists.imp_questions.rotate_list;

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

    public int size(ListNode head){
        ListNode temp = head;
        int size = 0;

        while(temp!=null){
            size++;
            temp = temp.next;
        }

        return size;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }

        int size = size(head);
        
        int rotationCount = k % size;

        if(rotationCount == 0){
            return head;
        }

        ListNode last = head;
        ListNode newHead = head;
        ListNode newLast = head;

        // run the loop until we get our actual last node of the list
        for(int i=1; last.next!=null; i++){
            if(i == size - rotationCount){
                newLast = last;
                newHead = last.next;
            }
            last = last.next;
        }

        newLast.next = null;
        last.next = head;
        
        return newHead;
    }
}
