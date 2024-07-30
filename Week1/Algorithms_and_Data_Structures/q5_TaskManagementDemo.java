public class q5_TaskManagementDemo {
    public static void main(String[] args) {
        q5_TaskLinkedList taskList = new q5_TaskLinkedList();

        // Adding tasks
        taskList.addTask(new q5_Task(1, "Complete project proposal", "In Progress"));
        taskList.addTask(new q5_Task(2, "Review code changes", "Pending"));
        taskList.addTask(new q5_Task(3, "Update documentation", "Not Started"));

        System.out.println("Tasks after adding:");
        taskList.traverseTasks();

        // Searching for a task
        int searchId = 2;
        q5_Task foundTask = taskList.searchTask(searchId);
        if (foundTask != null) {
            System.out.println("\nFound task with ID " + searchId + ": " + foundTask);
        } else {
            System.out.println("\nTask with ID " + searchId + " not found.");
        }

        // Deleting a task
        int deleteId = 1;
        boolean deleted = taskList.deleteTask(deleteId);
        if (deleted) {
            System.out.println("\nTask with ID " + deleteId + " deleted successfully.");
        } else {
            System.out.println("\nTask with ID " + deleteId + " not found for deletion.");
        }

        System.out.println("\nTasks after deletion:");
        taskList.traverseTasks();
    }
}