package PractiseCodes.ListTask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Task2 {
    private static ArrayList<Member> members = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nClub Management System:");
            System.out.println("1. Add Member");
            System.out.println("2. Delete Member");
            System.out.println("3. List All Members");
            System.out.println("4. Search Member");
            System.out.println("5. Update Member");
            System.out.println("6. Sort Members Alphabetically");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMember(scanner);
                    break;
                case 2:
                    deleteMember(scanner);
                    break;
                case 3:
                    listMembers();
                    break;
                case 4:
                    searchMember(scanner);
                    break;
                case 5:
                    updateMember(scanner);
                    break;
                case 6:
                    sortMembers();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }

    private static void addMember(Scanner scanner) {
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        System.out.print("Enter member age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        members.add(new Member(name, age));
        System.out.println("Member added successfully!");
    }

    private static void deleteMember(Scanner scanner) {
        System.out.print("Enter member name to delete: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getName().equalsIgnoreCase(name)) {
                members.remove(i);
                found = true;
                System.out.println("Member deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }

    private static void listMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
        } else {
            System.out.println("Registered Members:");
            for (Member member : members) {
                System.out.println(member);
            }
        }
    }

    private static void searchMember(Scanner scanner) {
        System.out.print("Enter member name to search: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                System.out.println("Member found: " + member);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }

    private static void updateMember(Scanner scanner) {
        System.out.print("Enter member name to update: ");
        String name = scanner.nextLine();
        boolean found = false;

        for (Member member : members) {
            if (member.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new age: ");
                int newAge = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                member.setName(newName);
                member.setAge(newAge);
                found = true;
                System.out.println("Member updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }

    private static void sortMembers() {
        if (members.isEmpty()) {
            System.out.println("No members to sort.");
        } else {
            members.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()));
            System.out.println("Members sorted alphabetically!");
        }
    }
}

