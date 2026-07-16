package day25.activity;

import java.util.ArrayList;
import java.util.Scanner;

public class Activity16_TodoManager {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        int choice;

        do {
            System.out.println("===== TO DO LIST MANAGER =====");
            System.out.println("1. Add a Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Update a Task");
            System.out.println("4. Remove a Task");
            System.out.println("5. Clear All Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = input.nextLine();
                    tasks.add(task);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("\n===== TASK LIST =====");

                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + " - " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to update.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + " - " + tasks.get(i));
                        }

                        System.out.print("Enter task index to update: ");
                        int updateIndex = input.nextInt();
                        input.nextLine();

                        if (updateIndex >= 0 && updateIndex < tasks.size()) {
                            System.out.print("Enter new task: ");
                            String newTask = input.nextLine();
                            tasks.set(updateIndex, newTask);
                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to remove.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + " - " + tasks.get(i));
                        }

                        System.out.print("Enter task index to remove: ");
                        int removeIndex = input.nextInt();

                        if (removeIndex >= 0 && removeIndex < tasks.size()) {
                            System.out.println("Removed: " + tasks.remove(removeIndex));
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks have been cleared.");
                    break;

                case 6:
                    System.out.println("Thank you for using To Do List Manager!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        input.close();
    }
}
