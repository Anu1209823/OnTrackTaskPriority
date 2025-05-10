package task9_1.Task9_1P;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class TaskPriorityTest {
    
    private TaskPriority taskPriority;

    @Before
    public void setup() {
        taskPriority = new TaskPriority();  // Create an instance of TaskPriority before each test
    }

    @Test
    public void testSuggestNextTask() {
        Task task1 = new Task("4.2", true, 2);  // Task 4.2, submitted, due in 2 days
        Task task2 = new Task("5.1", false, 1);  // Task 5.1, not submitted, due in 1 day
        
        String nextTask = taskPriority.suggestNextTask(task1, task2);  // Call the method you are testing
        
        assertEquals("5.1", nextTask);  // Check that Task 5.1 is returned as the next task (due sooner)
    }
}
