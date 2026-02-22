package linked_lists.singly_linked_list;

public class Main{
    public static void main(String[] args){
        CustomLinkedList l1 = new CustomLinkedList();

        l1.insertAtFirst(5);
        l1.insertAtFirst(2);
        l1.insertAtFirst(8);
        l1.insertAtLast(10);
        l1.insertAtLast(23);
        l1.insertAtFirst(1);

        l1.insertAt(2, 17);

        l1.deleteFirst();
        l1.deleteLast();

        l1.deleteAt(1);

        l1.display();
        l1.find(2);
    }
}