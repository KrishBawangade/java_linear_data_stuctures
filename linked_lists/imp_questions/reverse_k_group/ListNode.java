package linked_lists.imp_questions.reverse_k_group;

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

    public boolean hasKElements(ListNode node, int k){
        int counter = 0;

        ListNode temp = node;

        while(temp!=null && counter<k){
            counter++;
            temp = temp.next;
        }

        return counter==k;
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        if(k==1){
            return head;
        }

        int counter = 2;

        ListNode prev = head;
        ListNode current = head.next;

        ListNode last = null;
        ListNode newEnd = prev;

        ListNode next = current.next;
        while(current!=null){

            // reverse the elements inside the group
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
            counter++;
            if(counter>k){
                counter = 2;
                if(last!=null){
                    last.next = prev;
                }else{
                    head = prev;
                }
                newEnd.next = current;
                last = newEnd;

                if(!hasKElements(current, k)){
                    // check if there are further k elements to form a group or not, if not break
                    break;
                }

                // reset the variables accordingly to the new group
                prev = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
                newEnd = prev;
            }
        }

        return head;
    }

    public ListNode reverseAlternateKGroup(ListNode head, int k) {

        if(k==1){
            return head;
        }

        int counter = 2;

        ListNode prev = head;
        ListNode current = head.next;

        ListNode last = null;
        ListNode newEnd = prev;

        ListNode next = current.next;

        boolean skipKElements = false;

        while(current!=null){

            if(skipKElements){
                for(int i=0; current!=null && i<k; i++){
                    last = prev;
                    prev = current;
                    current = next;
                    if(next!=null){
                        next = next.next;
                    }
                }
                newEnd = prev;

                if(!hasKElements(current, k)){
                    // check if there are further k elements to form a group or not, if not break
                    break;
                }
                skipKElements = false;
            }

            if(current == null){
                break;
            }

            // reverse the elements inside the group
            current.next = prev;
            prev = current;
            current = next;
            if(next!=null){
                next = next.next;
            }
            counter++;
            if(counter>k){
                skipKElements = true;
                counter = 2;
                if(last!=null){
                    last.next = prev;
                }else{
                    head = prev;
                }
                newEnd.next = current;
                last = newEnd;

                if(!hasKElements(current, k)){
                    // check if there are further k elements to form a group or not, if not break
                    break;
                }

                // reset the variables accordingly to the new group
                prev = current;
                current = next;
                if(next!=null){
                    next = next.next;
                }
                newEnd = prev;
            }
        }

        return head;
    }
}
