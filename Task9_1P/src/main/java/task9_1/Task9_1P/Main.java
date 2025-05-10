package task9_1.Task9_1P;

public class Main {
    public static void main(String[] args) {
        // Create two tasks for testing
        Task task1 = new Task("4.2", true, 2); // Task 4.2, submitted, due in 2 days
        Task task2 = new Task("5.1", false, 1); // Task 5.1, not submitted, due in 1 day

        // Create TaskPriority instance
        TaskPriority taskPriority = new TaskPriority();
        
        // Get and print the next task to prioritize
        String nextTask = taskPriority.suggestNextTask(task1, task2);
        System.out.println("The next task to complete is: " + nextTask);
    }
}
