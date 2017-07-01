package main.java.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.*;


@RestController
public class Controller {


    @RequestMapping(value="/todolist/getFromID")
    public ResponseEntity getFromID(@RequestParam(value="id") int givenid) {
        return getListItem(Main.ToDoList,givenid);
    }
    
    public static ResponseEntity getListItem(ToDoItem [] x, int y) {
    	for(int i = 0; i < x.length; i++) {
    		if(x[i].getID() == y) {
    			return ResponseEntity.ok(x[i]);
    		}
    	}
    	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("404: Bad Request.");
    }
	
}