package aop2;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
@Aspect
public class LoggingAspect {

	
	@Before("execution(* Employee.displayEmployeeDetails(..))")
	public void loggingbefore(JoinPoint joinpoint) {
		System.out.println("\n before"+joinpoint.getSignature());
	}
	@After("execution(* Employee.displayEmployeeDetails(..))")
	public void loggingafter(JoinPoint joinpoint) {
		System.out.println("\n after logging"+joinpoint.getSignature());
	}
	
}
