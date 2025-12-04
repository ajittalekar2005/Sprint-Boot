package in.at.beans;

public class Teacher {

	 private int teacherId;
	 private String teacherName;
	 private Subject sub;
	 
	 public Teacher( int teacherId , String teacherName, Subject sub) {
		  this.teacherId = teacherId;
		  this.teacherName = teacherName;
		  this.sub = sub;
		  
	}
	 
	 public void display() {
		 System.out.println("Theacher id :" +teacherId);
		 System.out.println("Theacher name : "+teacherName);
		 System.out.println(" Theached Subject :"+sub);
	 }
}
