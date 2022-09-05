package todo.app.exception;

public class TaskNotFoundException extends RuntimeException{

	public TaskNotFoundException() {
		super();
		
	}

	public TaskNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public TaskNotFoundException(String message, Throwable cause) {
		super(message, cause);
		
	}

	public TaskNotFoundException(String message) {
		super(message);
		
	}

	public TaskNotFoundException(Throwable cause) {
		super(cause);
		
	}

	
	
}
