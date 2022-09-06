package todo.app.controller;
 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.app.entity.Todo;

import todo.app.service.TaskService;



@RestController
@RequestMapping("/api")
public class TaskRestController {

	
	private TaskService taskService; 
	
	
	@Autowired 
	public TaskRestController(TaskService theTaskService) {
		this.taskService = theTaskService;
	}
	
	
	@GetMapping("/lists")
	public Iterable<Todo> getAllTask() {
		return  taskService.findAll();
	}
	
	
	@GetMapping("/lists/{taskId}")
	
	public Optional<Todo> getTask(@PathVariable int taskId) {
		
		return taskService.findById(taskId);
	}
	
	@PostMapping("/lists")
	public Todo saveTask(@RequestBody Todo theTask) {
		
		taskService.save(theTask);
		
		return theTask;
	}
	
	@PutMapping("lists")
	public Todo updateTask(@RequestBody Todo theTask) {
		
		taskService.save(theTask);
		
		return theTask;
	}
	
	
	
	@DeleteMapping("/lists/{taskId}")
	public String deleteById(@PathVariable int taskId) {
		taskService.deleteById(taskId);
		
		return "Deleted task id -" + taskId ;
		
	}
	
}
