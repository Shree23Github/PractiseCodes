package PractiseCodes.ListTask1;

import java.util.HashSet;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);

        HashSet<Integer> unique = new HashSet<>(list1);
        unique.addAll(list2);

        HashSet<Integer> common = new HashSet<>(list1);
        common.retainAll(list2);

        unique.removeAll(common);

        System.out.println("Unique elements: " + unique);
    }
}
