package PractiseCodes.ListTask1;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);

        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> unique = new HashSet<>();
        for (int num : list) {
            if (!unique.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}

