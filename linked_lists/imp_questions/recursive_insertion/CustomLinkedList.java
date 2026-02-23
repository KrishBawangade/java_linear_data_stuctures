package linked_lists.imp_questions.recursive_insertion;

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

        Node temp  = traverse(index, head);

        node.next = temp.next;
        temp.next = node;
        size++;
    }

    private Node traverse(int index, Node node){
        if(index == 1){
            return node;
        }

        return traverse(index-1, node.next);
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