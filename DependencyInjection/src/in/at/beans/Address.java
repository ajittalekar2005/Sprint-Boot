package in.at.beans;

public class Address {

   private String homeNo;
   private String city;
   private int pinCode;

   public String getHomeNo() {
	return homeNo;
}
   public void setHomeNo(String homeNo) {
	this.homeNo = homeNo;
   }
   public String getCity() {
	return city;
   }
   public void setCity(String city) {
	this.city = city;
   }
   public int getPinCode() {
	return pinCode;
   }
   public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
   }
   
   @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "#"+homeNo+"  "+city+"  "+pinCode ;
	}
   
   
   
}
