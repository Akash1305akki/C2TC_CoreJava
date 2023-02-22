
public class NestedIfElseDemo {

	public static void main(String[] args) {
		int n = 10;
		int o = 20;
		int p = 5;
		
		System.out.print("The Largest Number is: ");
		
		if(n > o) {
			if(n > p) 
				System.out.println(n);
			else 
				System.out.println(p);
		}
		
		else {
			if (p > o) 
				System.out.println(p);
			else 
				System.out.println(o);
			}

	}

}
