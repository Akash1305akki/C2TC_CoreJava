
public class BreakAndCountinueDemo {

	public static void main(String[] args) {
		
		//With the combination of a for loop and if statement break can be explained as :-
		for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; //break is executed and the loop is terminated when i value becomes 5.
            }
            System.out.println("The Value of i = " + i);
        }
        System.out.println("Loop is incomplete but, condition is achieved and break is executed");
        
        System.out.println("-----------------------------------------------------------");
        
        //let's explain the same example with continue statement
        
        for (int i = 0; i <= 10; i++) {
            if (i < 6) {
                continue;//only when the condition is reached values are printed.
            }
            System.out.println("The value of i = " + i);
        }
        System.out.println("Loop completed with the help of Continue Statement");
    }

}
