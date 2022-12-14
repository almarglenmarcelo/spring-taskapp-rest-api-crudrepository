package todo.app.aspect;



import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;




public class TaskServiceLogger{

	
	@Before("todo.app.aspect.AOPExpression.findAll()")
	public void beforeFindAllTasks(JoinPoint theJoinPoint) {
		
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		String methodSignature = theJoinPoint.getSignature().toShortString();
		
		System.out.println("The Method: " + methodSignature);
		
		
	}
}
