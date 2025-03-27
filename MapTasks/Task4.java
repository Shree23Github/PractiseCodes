package PractiseCodes.MapTasks;

import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        Map<String, Double> personHeightMap = new TreeMap<>();
        personHeightMap.put("Bob", 6.0);
        personHeightMap.put("Alice", 5.6);
        personHeightMap.put("Charlie", 5.9);

        personHeightMap.remove("Charlie");

        for (Map.Entry<String, Double> entry : personHeightMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

