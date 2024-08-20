package Com.Task_Management;
import java.util.ArrayList;
import java.util.Scanner;
public class TaskManager {
	private ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        Task task = new Task(description);
        tasks.add(task);
        System.out.println("Task added: " + description);
    }

    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setDescription(newDescription);
            System.out.println("Task updated at position " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid task position.");
        }
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.remove(index);
            System.out.println("Task removed: " + task.getDescription());
        } else {
            System.out.println("Invalid task position.");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i).getDescription());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = sc.nextLine();
                    manager.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task position to update: ");
                    int updateIndex = sc.nextInt() - 1;
                    sc.nextLine();  
                    System.out.print("Enter new task description: ");
                    String newDescription = sc.nextLine();
                    manager.updateTask(updateIndex, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task position to remove: ");
                    int removeIndex = sc.nextInt() - 1;
                    manager.removeTask(removeIndex);
                    break;
                case 4:
                    manager.displayTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        sc.close();
    }
}
