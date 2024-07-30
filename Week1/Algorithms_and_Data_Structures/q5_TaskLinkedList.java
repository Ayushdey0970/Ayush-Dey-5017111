public class q5_TaskLinkedList {
    private Node head;

    private class Node {
        q5_Task task;
        Node next;

        Node(q5_Task task) {
            this.task = task;
            this.next = null;
        }
    }

    public q5_TaskLinkedList() {
        this.head = null;
    }

    // Add a task to the end of the list
    public void addTask(q5_Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Search for a task by ID
    public q5_Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    // Traverse and print all tasks
    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete a task by ID
    public boolean deleteTask(int taskId) {
        if (head == null)
            return false;

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return true;
        }

        Node current = head;
        Node prev = null;
        while (current != null && current.task.getTaskId() != taskId) {
            prev = current;
            current = current.next;
        }

        if (current == null)
            return false;

        prev.next = current.next;
        return true;
    }
}