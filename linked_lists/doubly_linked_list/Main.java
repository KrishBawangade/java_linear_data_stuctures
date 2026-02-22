package linked_lists.doubly_linked_list;

public class Main {
    public static void main(String[] args){
        DoublyLinkedListCustom l1 = new DoublyLinkedListCustom();

        l1.insertAtFirst(4);
        l1.insertAtFirst(6);
        l1.insertAtFirst(41);
        l1.insertAtLast(2);

        l1.insertAt(2, 56);
        
        l1.display();
    }
}
