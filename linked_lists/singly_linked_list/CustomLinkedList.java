package linked_lists.singly_linked_list;

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

    public void insertAtLast(int val){
        if(tail == null){
            insertAtFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;


        size++;
    }

    public void insertAt(int index, int val){
        if(index == 0){
            insertAtFirst(val);
            return;
        }

        if(index>size-1){
            System.out.println("\nIndex Out of bound!");
            return;
        }

        Node node = new Node(val);

        int i= 0;
        Node temp  = head;

        while(i!=index-1){
            i++;
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        size++;
    }

    public void deleteFirst(){

        if(head == null){
            System.out.println("\nList is Already Empty");
            return;
        }

        head = head.next;
        size--;
    }

    public void deleteLast(){

        if(head == null){
            System.out.println("\nList is Already Empty");
            return;
        }

        if(tail == head){
            deleteFirst();
            return;
        }

        Node temp = head;
        Node prev = head;

        while(temp.next!=null){
            prev = temp;
            temp = temp.next;
        }

        prev.next = null;
        tail = prev;
        size--;
    }

    public void deleteAt(int index){
        if(head == null){
            System.out.println("\nList is Already Empty");
            return;
        }

        if(index>size-1){
            System.out.println("\nIndex Out of bound!");
            return;
        }

        if(index == 0){
            deleteFirst();
            return;
        }

        int i= 0;
        Node temp  = head;
        Node prev = temp;

        while(i!=index){
            i++;
            prev = temp;
            temp = temp.next;
        }

        prev.next = temp.next;
        size--;
    }

    public void find(int value){
        if(head == null){
            System.out.println("\nThe List is Empty");
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
        return;
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

        System.out.print("End");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
        }
    }

}