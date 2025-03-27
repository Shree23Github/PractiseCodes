package PractiseCodes;

import java.util.ArrayList;
import java.util.Collections;

public class ListTask3 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1, 1, 2, 3, 4, 5);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 4, 5, 6, 7, 8);

        boolean areEqual = list1.equals(list2);
        System.out.println("Are the two lists equal? " + areEqual);

        ArrayList<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        System.out.println("Common elements: " + commonElements);

        ArrayList<Integer> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined list: " + joinedList);

        ArrayList<Integer> clonedList = (ArrayList<Integer>) list1.clone();
        System.out.println("Cloned list (copy of list1): " + clonedList);
    }
}

