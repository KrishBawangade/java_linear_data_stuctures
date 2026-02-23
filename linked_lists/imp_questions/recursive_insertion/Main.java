package linked_lists.imp_questions.recursive_insertion;

public class Main {
    public static void main(String[] args){
        CustomLinkedList l1 = new CustomLinkedList();
        l1.insertAtLast(34);
        l1.insertAtLast(2);
        l1.insertAtLast(65);
        l1.insertAtLast(12);

        l1.insertAt(2, 5);

        l1.display();
    }
}
