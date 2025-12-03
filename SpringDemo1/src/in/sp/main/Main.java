package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.sp.beans.Student;

public class Main {
    public static void main(String[] args) {
        ApplicationContext contex =
            new ClassPathXmlApplicationContext("in/sp/resorce/springConfiguration.xml");

        // safer: get by type
        Student std = (Student) contex.getBean("Student");
        std.display();
        
        System.out.println("==============================================");
        
        Student std1 = (Student) contex.getBean("Student");
        std1.setName("Sagar");
        std1.setRollNo(123);
        std1.setEmail("sagar@gmail.com");
        std1.display();
    }
}
