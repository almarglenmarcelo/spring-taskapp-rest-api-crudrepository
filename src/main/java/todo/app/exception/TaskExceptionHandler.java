package todo.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class TaskExceptionHandler {

	@ExceptionHandler
	public ResponseEntity<TaskErrorResponse> handleException (TaskNotFoundException exc) {
			
		TaskErrorResponse error = new TaskErrorResponse();
		
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage("Task id does not exist!");
		error.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
}
