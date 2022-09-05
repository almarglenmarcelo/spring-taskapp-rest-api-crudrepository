package todo.app.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AOPExpression {

	@Pointcut("execution(* todo.app.service.TaskService.findAllTasks(..))")
	public void findAll() {}
	
}
