package linked_lists.circular_linked_list;

public class Main {
    public static void main(String[] args){
        CircularLinkedListCustom l1 = new CircularLinkedListCustom();

        l1.insertAtFirst(34);
        l1.insertAtFirst(2);
        l1.insertAtFirst(8);

        l1.delete(2);

        l1.display();
    }
}
