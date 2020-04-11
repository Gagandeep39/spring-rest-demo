/**
 * Gagandeep
 * 9:05:29 am
 * 10-Apr-2020
 */
package com.gagan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ControllerAdvice
 * Similar to filter and Interceptor 
 * Preprocess request to Controller, post process response(mostly exception)
 * 
 */
@ControllerAdvice
public class StudentRestErrorHandler {
	  /**
     * Creating Error Handler
     * 1. Use annotation @ErrorHandler
     * 2. Sepcify the exception as Parameneter to be caught
     * 3. Return the ResponseEntity
     */
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleErrorResponse(StudentNotFoundException exception){
    	StudentErrorResponse response = new StudentErrorResponse();
    	response.setStatus(HttpStatus.NOT_FOUND.value());
    	response.setMessage(exception.getMessage());
    	response.setTimeStamp(System.currentTimeMillis());
    	return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
    
//    WARNING: No mapping found for HTTP request with URI [/spring-rest-demo/api/66/wdsfergth] in DispatcherServlet with name 'dispatcher'
    // Error we get when we give character for path variable instad of integer
    /**
     * Handle all forms of Exception
     */
    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> catchAll(Exception e){
    	StudentErrorResponse response = new StudentErrorResponse();
    	response.setStatus(HttpStatus.BAD_REQUEST.value());
    	response.setMessage(e.getMessage());
    	response.setTimeStamp(System.currentTimeMillis());
    	return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
    
    
}
