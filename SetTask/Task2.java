package PractiseCodes.SetTask;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {45, 78, 90, 1, 8, 0, 23};

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int num : numbers) {
            linkedHashSet.add(num);
        }
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int num : numbers) {
            treeSet.add(num);
        }

        System.out.println("Iteration order of LinkedHashSet (preserves insertion order):");
        Iterator<Integer> linkedIterator = linkedHashSet.iterator();
        while (linkedIterator.hasNext()) {
            System.out.print(linkedIterator.next() + " ");
        }

        System.out.println();

        System.out.println("Iteration order of TreeSet (sorted order):");
        Iterator<Integer> treeIterator = treeSet.iterator();
        while (treeIterator.hasNext()) {
            System.out.print(treeIterator.next() + " ");
        }
    }
}

