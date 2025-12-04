package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sp.beans.*;

import in.sp.resorce.CollegeConfiguration;

public class DisplayCollegeData {

	public static void main(String[] args) {
		
		ApplicationContext context = new  AnnotationConfigApplicationContext(CollegeConfiguration.class);
		
		College clg = (College) context.getBean("coolegeBean");
		
		
		clg.display();
	}
}
