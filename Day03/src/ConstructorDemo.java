
public class ConstructorDemo {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.setCustomerid(1);
		c1.setCustomername("Akash");
		c1.setCustomercity("Chennai");
		
Customer c2 = new Customer();
		
		c2.setCustomerid(2);
		c2.setCustomername("Siva");
		c2.setCustomercity("Chengalpattu");
		
		
		System.out.println(c1.getCustomerid());
		System.out.println(c1.getCustomername());
		System.out.println(c1.getCustomercity());
		System.out.println(c2.getCustomerid());
		System.out.println(c2.getCustomername());
		System.out.println(c2.getCustomercity());
	}

}
