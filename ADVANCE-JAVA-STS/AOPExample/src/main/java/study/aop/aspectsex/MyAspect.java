package study.aop.aspectsex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@EnableAspectJAutoProxy
@Component
@Aspect
public class MyAspect {

	
	@Pointcut("execution(void study.aop.beans.AccountBean.withdraw(..))")
	public void thismethod() {}
	
	@Pointcut("execution(* study.aop.beans.*.*(..))")
	public void thatmethod() {}
	
	@Pointcut("execution(* study.aop.controllers.MyController.f1())")
	public void ctrlmethod() {}
	
	
	@Before("ctrlmethod()")
	public void doSmthing()
	{
		System.out.println("REQUEST COMING TO F1....");
	}
	
	
	@Before("thismethod()")
	public void doThis()
	{
		System.out.println("WARNING  YOUR ACCOUNT HAS A WITHDRAWAL REQUEST ----");
	}
	
	
	@Before("thatmethod()")
	public void doThat()
	{
		System.out.println("NOTIFICATION  -YOUR ACCOUNT IS ACCESSED ....");
	}
	
	@After("thismethod()")
	public void doThisAlso()
	{
		System.out.println("THANKS FOR BANKING WITH US..");
	}
	
	
	@Around("thismethod()")
	public Object always(ProceedingJoinPoint jp)
	{
		Object obj=null;
		System.out.println("Your function starts now.."); //LOGGING  
		
		//check for authentication
		//synchronized(this) {
		try {
			//transactioion.begin();
			obj = jp.proceed();  //calling the function  !!!
			//commit transaction
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Your function ends here...");
		return obj;
	}
	
	
	
}
