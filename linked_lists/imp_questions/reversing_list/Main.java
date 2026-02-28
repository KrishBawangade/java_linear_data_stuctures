package linked_lists.imp_questions.reversing_list;

public class Main {
    public static void main(String[] args){
        CustomLinkedList l1 = new CustomLinkedList();

        l1.insert(67);
        l1.insert(3);
        l1.insert(45);
        l1.insert(7);

        l1.display();

        l1.reverse();
        l1.display();
    }
}
