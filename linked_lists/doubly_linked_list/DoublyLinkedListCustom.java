package linked_lists.doubly_linked_list;

public class DoublyLinkedListCustom {

    Node head;
    Node tail;
    int size;

    public DoublyLinkedListCustom(){
        size = 0;
    }

    public void insertAtFirst(int value){

        Node node = new Node(value);
        
        if(head == null){
            head = node;
            tail = head;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        size++;
    } 

    public void insertAtLast(int value){
        Node node = new Node(value);

        if(head == null){
            insertAtFirst(value);
            return;
        }

        tail.next = node;
        node.prev = tail;

        tail = node;
        size++;
    }

    public void insertAt(int index, int value){
        Node node = new Node(value);

        if(index == 0){
            insertAtFirst(value);
            return;
        }

        if(index>size-1){
            System.out.println("\nIndex Out Of Bound!");
            return;
        }
        Node temp = head;
        for(int i=0; i<size-1; i++){
            if(index-1 == i){
                break;
            }
            temp = temp.next;
        }

        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        size++;
    }

    public void display(){
        if(head == null){
            System.out.println("\nThe List is Empty!");
            return;
        }

        Node temp = head;

        while(temp!=null){
            System.out.printf("%d <-> ", temp.value);

            temp = temp.next;

            if(temp == null){
                System.out.print("End");
            }
        }
    }


    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }
    }
}
