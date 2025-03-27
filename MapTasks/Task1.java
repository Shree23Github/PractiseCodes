package PractiseCodes.MapTasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> cityPopulation = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nCity Population Management:");
            System.out.println("1. Add a city and its population");
            System.out.println("2. Remove a city");
            System.out.println("3. Check population of a city");
            System.out.println("4. Display all cities and populations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter city name: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter population: ");
                    int population = scanner.nextInt();
                    scanner.nextLine();
                    cityPopulation.put(city, population);
                    System.out.println("City added successfully.");
                    break;
                case 2:
                    System.out.print("Enter city name to remove: ");
                    String removeCity = scanner.nextLine();
                    if (cityPopulation.remove(removeCity) != null) {
                        System.out.println("City removed successfully.");
                    } else {
                        System.out.println("City not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter city name to check population: ");
                    String checkCity = scanner.nextLine();
                    if (cityPopulation.containsKey(checkCity)) {
                        System.out.println("Population of " + checkCity + ": " + cityPopulation.get(checkCity));
                    } else {
                        System.out.println("City not found.");
                    }
                    break;
                case 4:
                    System.out.println("Cities and their populations:");
                    for (Map.Entry<String, Integer> entry : cityPopulation.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
