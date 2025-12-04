package in.at.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.at.beans.Teacher;

public class Main2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("in/at/resorce/theacherContext.xml");
		Teacher ter = (Teacher) context.getBean("ter");
		
		ter.display();
	}
}
