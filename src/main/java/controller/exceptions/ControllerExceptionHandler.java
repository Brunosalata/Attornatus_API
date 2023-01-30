package controller.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;
import services.exceptions.PersonaNotFoundException;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(PersonaNotFoundException.class)
	public ResponseEntity<StandardError> personaNotFound(PersonaNotFoundException e, HttpServletRequest request){
		StandardError error = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
	}
	
}
