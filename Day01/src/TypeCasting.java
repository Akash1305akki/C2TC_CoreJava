
public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * Type Casting: - It is a method of converting one form(Type) of variable to
		 * other form(Type) of variable. - Casting one Form of variable to other form.
		 * Based on the size of variable under casting, Casting can be of 2 types: 
		 *        - Implicit or Widening casting 
		 *        - Explicit or Narrowing casting
		 */
		
//		----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
//		- Implicit or Widening Casting
//		      Converting smaller data types to equal or larger data types.
//		      Here is an example of converting integer variable(Size: 4 byte) to float(Size: 4 byte) and double(Size: 8 byte)
		int myInt1 = 42; // Size: 4 byte
		float myFloat1 = myInt1; // Size: 4 byte
		double myDouble1 = myInt1; // Size: 8 byte
		System.out.println("Integer: "+myInt1+ ", Float: "+myFloat1+ ", Double: "+myDouble1);
		
		char ch1 = 65; //Returns the ASCII Character for 65 which is considered as a Byte value(Size: 1 byte) and implicitly casted as a character(Size: 2 bytes)
		char ch2 = 6787;//Returns a '?' for every value above 127 as it falls under integer data type(Size: 4 bytes) and cannot be casted implicitly as a character(Size: 2 byte)
		System.out.println("Character1: "+ch1+ ", Character2: "+ch2);
		
//		----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		
//		- Explicit or Narrowing Casting
//	         Converting larger data types to smaller data types.
//	         Here is an example of converting double variable(Size: 8 bytes) to float(Size: 4 bytes) and integer(Size: 4 bytes)
//		     Casting should be explicitly entitled.
		double myDouble2 = 3.141594567896037;
		int myInt2 = (int) myDouble2;
		float myFloat2 = (float) myDouble2;
		System.out.println("Double: "+myDouble2+ ", Integer: "+myInt2+", Float: "+myFloat2);

	}

}
