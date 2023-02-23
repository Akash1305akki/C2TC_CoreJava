
public class Customer {
	
	private int customerid;
	private String customername;
	private String customercity;
	
	
	Customer(){
		
	}
	
	void display() {
		System.out.println(customerid+" "+customername+" "+customercity);
	}
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customerid) {
		this.customername = customername;
	}
	public String getCustomercity() {
		return customercity;
	}
	public void setCustomercity(String customerid) {
		this.customercity = customercity;
	}
	

}
