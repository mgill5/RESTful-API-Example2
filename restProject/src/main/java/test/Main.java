package main.java.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
	
	public static ToDoItem item1 = new ToDoItem(1,"DISHES","Do the dishes","07/01/2017");
	public static ToDoItem item2 = new ToDoItem(2,"PROGRAMMING","Finish your programming","07/04/2017");
	public static ToDoItem item3 = new ToDoItem(3,"SLEEP","Go to sleep","07/07/2017");
	public static ToDoItem[] ToDoList = {item1,item2,item3};
	
	public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
	
}
