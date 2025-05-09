public class Task {
    private String taskId;
    private boolean isSubmitted;
    private int dueDays;

    public Task(String taskId, boolean isSubmitted, int dueDays) {
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
