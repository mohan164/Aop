package aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	 Employee emp=(Employee) context.getBean("employeeid");
	 emp.displayEmployeeDetails(10);
}
}
