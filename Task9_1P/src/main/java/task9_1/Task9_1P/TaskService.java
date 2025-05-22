package task9_1.Task9_1P;

import java.util.*;

public class TaskService {
    private Map<String, List<String>> studentTasks = new HashMap<>();

    public void submitTask(String studentId, String task) {
        studentTasks.computeIfAbsent(studentId, k -> new ArrayList<>()).add(task);
    }

    public List<String> getTasksForStudent(String studentId) {
        return studentTasks.getOrDefault(studentId, Collections.emptyList());
    }
}
