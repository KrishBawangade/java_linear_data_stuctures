package linked_lists.imp_questions.reversing_list;

public class CustomLinkedList {
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

    public void reverse(){
        reverseList(head);
    }

    public void reverseList(Node node){
        if(node == tail){
            head = node;
            return;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
