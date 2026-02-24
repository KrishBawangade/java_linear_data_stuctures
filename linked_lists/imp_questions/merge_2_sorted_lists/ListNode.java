package linked_lists.imp_questions.merge_2_sorted_lists;


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
        System.out.println();
    }


    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        int size = 0;
        ListNode mergedHead = list1;
        ListNode mergedTemp = mergedHead;
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1!=null && temp2!=null){

            
            if(temp1.val<temp2.val){
                ListNode newNode = new ListNode(temp1.val);
                if(size == 0){
                    // define the head
                    mergedHead = newNode;
                    mergedTemp = mergedHead;
                }else{
                    mergedTemp.next = newNode;
                }
                temp1 = temp1.next;
            }else{
                ListNode newNode = new ListNode(temp2.val);
                if(size == 0){
                    // define the head
                    mergedHead = newNode;
                    mergedTemp = mergedHead;
                }else{
                    mergedTemp.next = newNode;
                }
                temp2 = temp2.next;
            }
            if(size>0){
                mergedTemp = mergedTemp.next;
            }
            size++;
        }

        while(temp1!=null){
            ListNode newNode = new ListNode(temp1.val);
            if(size == 0){
                mergedHead = newNode;
                mergedTemp = mergedHead;
            }else{
                mergedTemp.next = newNode;
            }
            temp1 = temp1.next;
            if(size > 0){
                mergedTemp = mergedTemp.next;
            }
            size++;
        }

        while(temp2!=null){
            ListNode newNode = new ListNode(temp2.val);
            if(size == 0){
                mergedHead = newNode;
                mergedTemp = mergedHead;
            }else{
                mergedTemp.next = newNode;
            }
            temp2 = temp2.next;
            if(size > 0){
                mergedTemp = mergedTemp.next;
            }
            size++;
        }

        return mergedHead;
    }

}