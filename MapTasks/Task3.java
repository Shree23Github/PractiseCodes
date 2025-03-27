package PractiseCodes.MapTasks;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("Search key 2: " + map.containsKey(2));
        System.out.println("Search value 'Banana': " + map.containsValue("Banana"));

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        TreeMap<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(map);
        System.out.println("Sorted Map: " + sortedMap);

        map.clear();
        System.out.println("Map after deletion: " + map);
    }
}
