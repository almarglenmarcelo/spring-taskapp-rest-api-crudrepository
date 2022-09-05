package todo.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import todo.app.dao.TaskRepository;
import todo.app.entity.Todo;
import todo.app.exception.TaskNotFoundException;

@Transactional
@Service
public class TaskService{
	
	private TaskRepository taskRepository;
		
	@Autowired
	public TaskService(TaskRepository theTaskRepository) {
		this.taskRepository = theTaskRepository;
	}

	public Iterable<Todo> findAll() {
		
		return taskRepository.findAll();
	}
	
	
	public Optional<Todo> findById(int taskId) {
		
		Optional<Todo> theTask = taskRepository.findById(taskId);
		
		if(!(theTask.isPresent())) {
			throw new TaskNotFoundException();
		}
		
		
		return theTask;
	}

	
	public void save(Todo theTask) {
		
		
		taskRepository.save(theTask);
		System.out.println("Successfully updated the task with id " + theTask.getId());
	}

	
	public void deleteById(int taskId) {
		
		Optional<Todo> task = taskRepository.findById(taskId);
		
		if ((task.isPresent())) {
			taskRepository.deleteById(taskId);
			
		}else {
			throw new TaskNotFoundException();
		}
		
	}
	
	
}
