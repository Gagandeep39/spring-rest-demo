/**
 * Gagandeep
 * 8:31:06 am
 * 10-Apr-2020
 */
package com.gagan.exception;
/**
 * 
 * 1. Create an Error Response class (sttatus, code, message)
 * 2. Create a Custom Ecxception
 * 3. 
 *
 */
public class StudentNotFoundException extends RuntimeException {

	public StudentNotFoundException(String message) {
		super(message);
		
	}
}
