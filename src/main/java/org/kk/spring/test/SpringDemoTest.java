package org.kk.spring.test;

import org.kk.spring.beans.Student;
import org.kk.spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringDemoTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		
		Student student = null;
		
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		student = context.getBean("student",Student.class);
		student.getStudent();
		
		((AbstractApplicationContext) context).close();
	}

}
