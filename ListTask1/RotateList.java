package PractiseCodes.ListTask1;

import java.util.ArrayList;
import java.util.Collections;

public class RotateList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int rotateBy = 2;
        System.out.println("Original list: " + list);

        Collections.rotate(list, -rotateBy);
        System.out.println("List after left rotation: " + list);
    }
}
