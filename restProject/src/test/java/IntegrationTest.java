package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class IntegrationTest {

	@Test
	public void testGetAPICall() {
		get("http://localhost:8080/todolist/getFromID?id=1").then().assertThat().body("title",equalTo("DISHES"));
	}

}
