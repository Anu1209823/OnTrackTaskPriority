package task9_1.Task9_1P;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TaskPriorityTest {

    private TaskPriority taskPriority;

    @Before
    public void setup() {
        taskPriority = new TaskPriority(); // Create an instance before tests
    }

    @Test
    public void testSuggestNextTask() {
        Task task1 = new Task("4.2", true, 2);   // submitted, due in 2 days
        Task task2 = new Task("5.1", false, 1);  // not submitted, due in 1 day

        String nextTask = taskPriority.suggestNextTask(task1, task2);
        assertEquals("5.1", nextTask); // Task 5.1 should be next due
    }
}
