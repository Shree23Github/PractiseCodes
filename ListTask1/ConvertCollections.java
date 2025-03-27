package PractiseCodes.ListTask1;

import java.util.*;

public class ConvertCollections {
    public static void main(String[] args) {

        List<Integer> list = List.of(1, 2, 2, 3);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("List to Set: " + set);

        List<Integer> newList = new ArrayList<>(set);
        System.out.println("Set to List: " + newList);
    }
}

