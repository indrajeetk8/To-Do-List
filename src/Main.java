// src/Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        String command;

        System.out.println("Welcome to the To-Do List App!");
        System.out.println("Available commands: add, view, remove, exit");

        while (true) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    System.out.println("Task added.");
                    break;

                case "view":
                    toDoList.viewTasks();
                    break;

                case "remove":
                    System.out.print("Enter task number to remove: ");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    toDoList.removeTask(index);
                    System.out.println("Task removed.");
                    break;

                case "exit":
                    System.out.println("Exiting the application.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }
}
