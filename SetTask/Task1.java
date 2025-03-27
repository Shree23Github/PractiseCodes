package PractiseCodes.SetTask;

import java.util.HashSet;
import java.util.Iterator;

public class Task1 {
    public static void main(String[] args) {
        HashSet<String> months = new HashSet<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        System.out.println("Iterating through the HashSet:");
        Iterator<String> iterator = months.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\nCheck if order is preserved:");
        System.out.println("HashSet does NOT preserve the insertion order.");
    }
}
