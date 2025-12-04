package in.at.beans;

public class Student {

	private String name;
	private int rollNo;
	private Address add;
	
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
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("roll no : "+rollNo);
		System.out.println("address : "+add);
	}
}
