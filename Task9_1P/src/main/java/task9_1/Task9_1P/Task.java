package task9_1.Task9_1P;

public class Task {
    private String taskId;
    private boolean submitted;
    private int daysUntilDue;

    public Task(String taskId, boolean submitted, int daysUntilDue) {
        this.taskId = taskId;
        this.submitted = submitted;
        this.daysUntilDue = daysUntilDue;
    }

    public String getTaskId() {
        return taskId;
    }

    public boolean isSubmitted() {
        return submitted;
    }

    public int getDaysUntilDue() {
        return daysUntilDue;
    }
}
