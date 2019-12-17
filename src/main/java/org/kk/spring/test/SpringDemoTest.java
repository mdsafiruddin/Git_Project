package org.kk.spring.test;

import org.kk.spring.beans.Student;

public class SpringDemoTest {

	public static void main(String[] args) {
		ApplicationContext context = null;
		Student student = null;
		
		student = context.getBean("student",Student.class);
		System.out.println(student.getStudent());
		
	}

}
