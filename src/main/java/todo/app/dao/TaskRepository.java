package todo.app.dao;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import todo.app.entity.Todo;

@Repository
public interface TaskRepository extends CrudRepository<Todo, Integer>{

	
	

}
