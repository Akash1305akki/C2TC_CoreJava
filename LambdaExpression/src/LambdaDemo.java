import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;


public class LambdaDemo {

	public static void main(String[] args) {
		
		//Using in a implementable interface: IntBinaryOperator
		IntBinaryOperator sum = (a, b) -> a + b;
		int result = sum.applyAsInt(5, 5);
		
		System.out.println("Sum: "+result);
		
		// Using to print values inside a collection by integrating with for each loop.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    System.out.print("Inside ArrayList : ");
		numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    numbers.forEach( (n) -> { System.out.print(n); } );
	    System.out.println();
	    
	    //To copy a collection variables inside another where customer is another functional interface
	    Consumer<Integer> method = (n) -> { System.out.print(n); };
	    System.out.print("Inside Customer: ");
	    numbers.forEach( method );

	}

}
