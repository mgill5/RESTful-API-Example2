package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.test.Main;

public class UnitTest {

	@Test
	public void ID_1_Should_Return_Correct_Info() {
		int id = Main.ToDoList[0].getID();
		String title = Main.ToDoList[0].getTitle();
		String description = Main.ToDoList[0].getDescription();
		String duedate = Main.ToDoList[0].getDueDate();
		
		assertEquals(id,1);
		assertEquals(title,"DISHES");
		assertEquals(description,"Do the dishes");
		assertEquals(duedate,"07/01/2017");
	}

}
