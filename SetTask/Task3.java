package PractiseCodes.SetTask;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<String> vehicleTypes = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nVehicle Management System:");
            System.out.println("1. Add Vehicle Type");
            System.out.println("2. Remove Vehicle Type");
            System.out.println("3. Check if Vehicle Type Exists");
            System.out.println("4. Display Available Vehicle Types");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle type to add: ");
                    String addType = scanner.nextLine();
                    if (vehicleTypes.add(addType)) {
                        System.out.println("Vehicle type added successfully.");
                    } else {
                        System.out.println("Vehicle type already exists.");
                    }
                    break;
                case 2:
                    System.out.print("Enter vehicle type to remove: ");
                    String removeType = scanner.nextLine();
                    if (vehicleTypes.remove(removeType)) {
                        System.out.println("Vehicle type removed successfully.");
                    } else {
                        System.out.println("Vehicle type not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter vehicle type to check: ");
                    String checkType = scanner.nextLine();
                    if (vehicleTypes.contains(checkType)) {
                        System.out.println("Vehicle type exists.");
                    } else {
                        System.out.println("Vehicle type does not exist.");
                    }
                    break;
                case 4:
                    System.out.println("Available vehicle types:");
                    for (String vehicle : vehicleTypes) {
                        System.out.println(vehicle);
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
