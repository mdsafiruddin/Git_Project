package org.kk.spring.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Khube")
	private String name;
	@Value("Raipur")
	private String address;
	
	@Autowired
	private Date dob;
	
	public Student() {
		System.out.println("Student 0-param constructor");
	}
	
	public void getStudent() {
		System.out.println("Name : "+name);
		System.out.println("Address : "+address);
		System.out.println("DOB : "+dob);
	}
}
