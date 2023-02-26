import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Person Name: ");
		String name = sc.next();
		
		System.out.println("Enter Person Age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter Person Gender: ");
		String gender = sc.next();
		
		System.out.println("Enter Person Income: ");
		int income = sc.nextInt();
		
		sc.close();
		
		Person p1 = new Person();
		p1.setName(name);
		p1.setAge(age);
		p1.setGender(gender);
		p1.setIncome(income);
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("Before Calculating Tax: ");
		System.out.println(p1);
		
		System.out.println("-------------------------------------------------------------------------");
		
		TaxCalculation calc = new TaxCalculation();
		calc.CalculateTax(p1);
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println("After Calculating Tax: ");
		System.out.println(p1);
	}
}
