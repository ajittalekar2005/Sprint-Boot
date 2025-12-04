package in.at.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.at.beans.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("in/at/resorce/applicationContext.xml");
		Student std = (Student) context.getBean("std");
		std.display();
	}

}
