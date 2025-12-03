package in.sp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Student")
public class Student {
	
	@Value("Ajit")
	 private String name;
	@Value("123")
	 private int rollNo ;
	@Value("xyz@mail.com")
	 private String email;
	 
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getRollNo() {
		 return rollNo;
	 }
	 public void setRollNo(int rollNo) {
		 this.rollNo = rollNo;
	 }
	 public String getEmail() {
		 return email;
	 }
	 public void setEmail(String email) {
		 this.email = email;
	 }
	 
	 
	 public void display() {
		 System.out.println(" name : "+name);
		 System.out.println("Roll no : "+rollNo);
		 System.out.println("Email : "+email);
	 }
	 
	 
}
