package PractiseCodes.ListTask1;

import java.util.ArrayList;

public class TrimArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println("Capacity before trimming: " + list.size());
        list.trimToSize();
        System.out.println("Capacity after trimming: " + list.size());
    }
}

