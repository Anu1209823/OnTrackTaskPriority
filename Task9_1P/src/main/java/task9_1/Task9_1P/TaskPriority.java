package task9_1.Task9_1P;

public class TaskPriority {

    // Add this method:
    public String suggestNextTask(Task t1, Task t2) {
        // If task1 not submitted and task2 is submitted, suggest task1
        if (!t1.isSubmitted() && t2.isSubmitted()) {
            return t1.getTaskId();
        }
        // If task2 not submitted and task1 is submitted, suggest task2
        if (t1.isSubmitted() && !t2.isSubmitted()) {
            return t2.getTaskId();
        }
        // If both not submitted, suggest the one due sooner
        if (!t1.isSubmitted() && !t2.isSubmitted()) {
            if (t1.getDaysUntilDue() <= t2.getDaysUntilDue()) {
                return t1.getTaskId();
            } else {
                return t2.getTaskId();
            }
        }
        // If both submitted, no tasks to suggest
        return "No pending tasks";
    }
}
