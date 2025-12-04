package in.at.beans;

public class Subject {
  private String java;
  private String python;
  private String php;
  
  
  public Subject(String java , String python , String php) {
	  this.java = java;
	  this.python = python;
	  this.php = php;
  }
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "#" +java+"  "+python+" "+php;
	}
}
