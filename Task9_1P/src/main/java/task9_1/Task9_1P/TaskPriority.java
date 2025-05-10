package task9_1.Task9_1P;

public class TaskPriority {

    public String suggestNextTask(Task task1, Task task2) {
        // Ensure both tasks are valid
        if (task1 == null || task2 == null) {
            throw new IllegalArgumentException("Tasks cannot be null");
        }

        // Suggest the task based on due date (the one that is due sooner)
        if (task1.isSubmitted() && !task2.isSubmitted()) {
            return task2.getTaskId(); // Suggest task2 if task1 is already submitted and task2 is not
        }

        if (task1.getDueDays() < task2.getDueDays()) {
            return task1.getTaskId(); // Suggest task1 if it is due sooner
        } else {
            return task2.getTaskId(); // Suggest task2 if it is due sooner
        }
    }
}
