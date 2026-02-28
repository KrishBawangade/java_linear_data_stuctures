package linked_lists.imp_questions.sort_list;

public class CustomLinkedList{

    private Node head;
    private Node tail;
    private int size;


    public CustomLinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }

    public void insert(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;


        size++;
    }

    public void find(int value){
        if(head == null){
            System.out.println("\nThe List is Empty");
            return;
        }

        Node temp = head;
        int i=0;
        while(temp!=null){
            if(temp.value == value){
                System.out.printf("\nValue(%d) found at index %d", value, i);
                return;
            }
            i++;
            temp = temp.next;
        }

        System.out.printf("\nValue(%d) not found in the list", value);
    }

    public Node findNodeAt(int index){
        if(head == null){
            System.out.println("\nThe List is Empty");
            return head;
        }

        if(index>size-1){
            System.out.println("\nIndex out of bound!");
            return head;
        }

        Node temp = head;
        int i=0;
        while(i<=index){
            if(i==index){
                return temp;
            }
            i++;
            temp = temp.next;
        }

        return head;
    }
    
    public void display(){
        if(head == null){
            System.out.println("\nThe Linked List is Empty!");
        }

        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.print("End\n");
    }

    public void bubbleSort(){
        if(head == null || head.next == null){
            return;
        }

        for(int i=0; i<size-1; i++){
            Node temp = head;

            for(int j=0; j<size-1-i; j++){
                Node first = temp;
                Node second = temp.next;

                if(first.value > second.value){
                    if(temp == head){
                        head = second;
                        first.next = second.next;
                        head.next = first;
                        temp = first;
                        continue;
                    }

                    if(temp == tail){
                        Node prev = findNodeAt(j-1);
                        prev.next = second;
                        second.next = first;
                        first.next = null;
                        tail = first;
                        temp = tail;
                        continue;
                    }

                    Node prev = findNodeAt(j-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                    temp = first;
                    continue;
                }

                temp = temp.next;
            }
        }
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

}