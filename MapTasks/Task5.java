package PractiseCodes.MapTasks;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        SortedMap<Integer, String> subMap = map.subMap(2, 5);

        for (Map.Entry<Integer, String> entry : subMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

