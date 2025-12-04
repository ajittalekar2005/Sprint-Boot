package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resorce.StudentConfiguration;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfiguration.class);
		
		Student std = (Student) context.getBean("Student");
		std.display();
	}

}
