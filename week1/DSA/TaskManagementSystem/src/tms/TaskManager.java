package tms;

public class TaskManager {
	    private Node head;

	    public TaskManager() {
	        this.head = null;
	    }

	    // Adding a new task to the end of the list
	    public void addTask(Task task) {
	        Node newNode = new Node(task);
	        if (head == null) {
	            head = newNode;
	        } else {
	            Node current = head;
	            while (current.getNext() != null) {
	                current = current.getNext();
	            }
	            current.setNext(newNode);
	        }
	    }

	    // Searching for a task by taskId
	    public Task searchTask(int taskId) {
	        Node current = head;
	        while (current != null) {
	            if (current.getTask().getTaskId() == taskId) {
	                return current.getTask();
	            }
	            current = current.getNext();
	        }
	        return null; // Not found
	    }

	    // Traversing and displaying all tasks
	    public void traverseTasks() {
	        Node current = head;
	        while (current != null) {
	            System.out.println(current.getTask());
	            current = current.getNext();
	        }
	    }

	    // Deleting a task by taskId
	    public boolean deleteTask(int taskId) {
	        if (head == null) {
	            return false; // List is empty
	        }

	        if (head.getTask().getTaskId() == taskId) {
	            head = head.getNext(); // Removing head
	            return true;
	        }

	        Node current = head;
	        while (current.getNext() != null) {
	            if (current.getNext().getTask().getTaskId() == taskId) {
	                current.setNext(current.getNext().getNext());
	                return true; // Task found and deleted
	            }
	            current = current.getNext();
	        }
	        return false; // Not found
	    }

	    public static void main(String[] args) {
	        TaskManager taskManager = new TaskManager();

	        // Adding tasks
	        taskManager.addTask(new Task(1, "Design the UI", "In Progress"));
	        taskManager.addTask(new Task(2, "Implement backend", "Not Started"));
	        taskManager.addTask(new Task(3, "Write unit tests", "Completed"));

	        // Traversing tasks
	        System.out.println("All Tasks:");
	        taskManager.traverseTasks();

	        // Searching for a task
	        int searchId = 2;
	        Task foundTask = taskManager.searchTask(searchId);
	        if (foundTask != null) {
	            System.out.println("\nFound Task with ID " + searchId + ":");
	            System.out.println(foundTask);
	        } else {
	            System.out.println("\nTask with ID " + searchId + " not found.");
	        }

	        // Deleting a task
	        int deleteId = 1;
	        boolean deleted = taskManager.deleteTask(deleteId);
	        if (deleted) {
	            System.out.println("\nDeleted Task with ID " + deleteId);
	        } else {
	            System.out.println("\nTask with ID " + deleteId + " not found.");
	        }

	        // Traversing tasks after deletion
	        System.out.println("\nAll Tasks After Deletion:");
	        taskManager.traverseTasks();
	    }
	}


