package Stack_Queue.PracticeLinkedList;

import static Stack_Queue.PracticeLinkedList.MyGenericStack.stackOfIStrings;
import static Stack_Queue.PracticeLinkedList.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("2. Stack of Strings");
        stackOfIStrings();
    }
}
