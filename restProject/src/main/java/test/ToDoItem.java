package main.java.test;

public class ToDoItem {

	private final int id;
	private final String title;
	private final String description;
	private final String duedate;
	
	public ToDoItem(int id,String title, String description, String duedate) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.duedate = duedate;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getDueDate() {
		return duedate;
	}
	
	public int getID() {
		return id;
	}
	
}
