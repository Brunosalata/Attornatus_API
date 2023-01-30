package services.exceptions;

public class PersonaNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public PersonaNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public PersonaNotFoundException(String message) {
		super(message);
	}

	
	
}
