package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Hello;
import in.sp.beans.Teacher;

public class TeacherDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("in/sp/resorce/teacherConfiguration.xml");
		 
		 Teacher tr = (Teacher) context.getBean("Teacher");
		  tr.display();
		  
	      context = new  ClassPathXmlApplicationContext("in/sp/resorce/teacherXmlConfiguration.xml");
		  
		  Hello c = (Hello) context.getBean("trr");
		  c.display();
	}

}
