package PractiseCodes.ListTask1;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElements {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A");

        System.out.println("Before replacement: " + list);
        Collections.replaceAll(list, "A", "Z");
        System.out.println("After replacement: " + list);
    }
}
