package task9_1.Task9_1P;

public class Task {
    private String taskId;
    private boolean isSubmitted;
    private int dueDays;

    public Task(String taskId, boolean isSubmitted, int dueDays) {
        if (dueDays < 0) {
            throw new IllegalArgumentException("Due days cannot be negative.");
        }
        this.taskId = taskId;
        this.isSubmitted = isSubmitted;
        this.dueDays = dueDays;
    }

    public String getTaskId() {
        return taskId;
    }

    public boolean isSubmitted() {
        return isSubmitted;
    }

    public int getDueDays() {
        return dueDays;
    }
}
