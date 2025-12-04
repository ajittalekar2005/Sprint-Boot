package in.sp.beans;

public class College {

	 private String CollegeName;
	 private int collegeId;
	 private String collegeGrade;
	 
	 
	 public String getCollegeName() {
		 return CollegeName;
	 }
	 public void setCollegeName(String collegeName) {
		 CollegeName = collegeName;
	 }
	 public int getCollegeId() {
		 return collegeId;
	 }
	 public void setCollegeId(int collegeId) {
		 this.collegeId = collegeId;
	 }
	 public String getCollegeGrade() {
		 return collegeGrade;
	 }
	 public void setCollegeGrade(String collegeGrade) {
		 this.collegeGrade = collegeGrade;
	 }
	 
	 public void display() {
		 
		 System.out.println("College name : "+CollegeName);
		 System.out.println("College id : "+collegeId);
		 System.out.println("College Gread : "+collegeGrade);
	 }
	 
	 
}
