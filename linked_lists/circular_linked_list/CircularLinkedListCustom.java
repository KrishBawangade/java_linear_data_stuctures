package linked_lists.circular_linked_list;

public class CircularLinkedListCustom {

    Node head;
    Node tail;
    int size;

    public CircularLinkedListCustom(){
        size = 0;
    }


    public void insertAtFirst(int value){
        Node node = new Node(value);

        if(head == null){
            head = node;
            tail = head;
            size++;
            return;
        }

        node.next = head;
        head = node;
        tail.next = head;
        size++;
    }

    public void insertAtLast(int value){
        Node node = new Node(value);

        if(head == null){
            insertAtFirst(value);
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void delete(int val){
        if(head == null){
            System.out.println("\nThe List is already Empty");
            return;
        }

        Node temp = head;
        Node prev = tail;
        boolean found = false;

        do { 
            if(temp.value == val){
                found = true;
                break;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        if(found){
            prev.next = temp.next;
            size--;
        }else{
            System.out.printf("\nElement(%d) not found in the list", val);
        }
    }

    public void display(){
        if(head == null){
            System.out.println("\nThe List is Empty!");
            return;
        }

        if(size == 1){
            System.out.printf("%d -> End", head.value);
            return;
        }

        Node temp = head;
        
        while(temp.next!=head){
            System.out.printf("%d -> ", temp.value);
            temp = temp.next;
            if(temp.next == head){
                System.out.printf("%d -> HEAD", temp.value);
            }
        }
        System.out.println();
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
