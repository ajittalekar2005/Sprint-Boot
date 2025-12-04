package in.sp.beans;


public class Hello {
	
	private  String name;
	private  int id;
	private String address;
	
//	public String getName() {
//		return name;
//	}
	public void setName(String name) {
		this.name = name;
	}
//	public int getId() {
//		return id;
//	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		 
		System.out.println("name "+name);
		System.out.println("id "+id);
		System.out.println("address"+address);
	}
     
}
