
abstract class Bank{
	abstract int RateOfIntrest();
}

//---------------------------------------------------------------------

class SBI extends Bank{
	int RateOfIntrest() {
		return 7;
	}
}

//---------------------------------------------------------------------

class Axis extends Bank{
	int RateOfIntrest() {
		return 8;
	}
}

//---------------------------------------------------------------------

public final class AbstractClassDemo2 {

	public static void main(String[] args) {
		
		SBI S = new SBI();
		Axis A = new Axis();
//		Bank B = new Bank();
//		Bank B = new SBI();
		
		System.out.println("The rate of intrest in SBI is: "+S.RateOfIntrest());
		System.out.println("The rate of intrest in Axis Bank is: "+A.RateOfIntrest());
//		System.out.println("The lower rate of intrest offered is: "B.RateOfIntrest());

	}

}
