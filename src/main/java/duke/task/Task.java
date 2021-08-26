package duke.task;

/**
 * Represents a Task the user wants to complete. 
 * A task object has a name, and can be done or not.
 */
public abstract class Task {
	private String name;
	private boolean done = false;

	/**
	 * Constructs a new Task with the given name.
	 */
	public Task(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	/**
	 * Returns whether the task is marked as done.
	 */
	public boolean isDone() {
		return done;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	/**
	 * Returns the string representation of the completeness of the task.
	 */
	public String getCheckBox() {
        return (done ? "[X] " : "[ ] "); // mark done task with X
    }

	@Override
	public String toString() {
		return getCheckBox() + this.name;
	}
}