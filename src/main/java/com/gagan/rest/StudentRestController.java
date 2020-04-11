package com.gagan.rest;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.gagan.entity.Student;
import com.gagan.exception.StudentErrorResponse;
import com.gagan.exception.StudentNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Entity;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	List<Student> list;
	
	public StudentRestController() {
		list = new ArrayList<>();
        list.add(new Student("Gagandeep", "Singh"));
        list.add(new Student("Lady", "Gaga"));
        list.add(new Student("Sia", "Furler"));
        list.add(new Student("Gagandeep", "Singh"));
	}
	

    /**
     * Siple Get API
     * Static data
     * @return Returs
     */
    @GetMapping("/students")
    public List<Student> getStudent(){
//        return null;// will show a blank page (postman shows emptyy response)
    	return list;
    }
    
    /**
     * Path Variable
     * @param studentId
     * @return
     */
    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
    	if(studentId >= list.size() || studentId<0)
    		throw new StudentNotFoundException("Student doesnt exist");
    	return list.get(studentId);
    }
    
  
}
