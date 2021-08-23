/**
 * Represents a task with a deadline to be completed by.
 */
public class Deadline extends Task {
	private String deadline="unknown";

	public Deadline(String name, String deadline) {
		super(name);
		this.deadline = deadline;
	}

	public String getDeadline() {
		return deadline;
	}

	@Override
	public String toString() {
		return "[D]" + super.toString() + " (by: " + this.getDeadline() + ")";
	}
}
