
public class DataTypes {

	public static void main(String[] args) {
		// Initialize and Print the different data types of java
		//Data Types were been classified as Primitive and Non-Primitive Data Types
		
		//Primitive Data Types: - Should have an original Values, Size and Constrains
		//                      - The value cannot be a 'NULL'
		byte b1 = 10; //Size: 1 byte, can store whole number values up to -127 to +127
		byte b2 = -10;
	    System.out.println(b1+ "," +b2);
	    
	    short s1 = 30890; //Size: 2 byte, can store whole number values up to -32,768 to 32,767
		short s2 = -29830;
	    System.out.println(s1+ "," +s2);
	    
	    int n1 = 567302348;//Size: 4 bytes,  can store whole number values up to -2,147,483,648 to 2,147,483,647
	    int n2 = 578924857;
	    System.out.println(n1+ "," +n2);
	    
		float fl = 6.89056734252783456f;//Size: 4 bytes, Stores fractional numbers, of 6 to 7 decimal digits
		System.out.println(fl);
		
		double db = 6.89056734252783456;//Size: 8 bytes, Stores fractional numbers, of 15 decimal digits
		System.out.println(db);
		
		char ch1 = 'a';//Size: 2 bytes, Can store a character(Upper case/Lower case) or their ASCII Values
		char ch2 = 65; //Returns the ASCII Character(Value) for the integer '65'
		System.out.println(ch1+ "," +ch2);
		
		boolean choise = false;// Size: 1 bit, It can store either one value between "True" or "False"
		System.out.println(choise);
		
		//Non-Primitive Data Types: - The Value can be a 'NULL', Size is not considered
		// (Example: String, Array,... etc)
		
		String text = "Hello Everyone"; 
		System.out.println(text);
		
 		
		/*
		 * //Difference B/W Primitive and Non-Primitive Data Types int n3 = ;
		 * //Primitive data types of integer and character with null values being
		 * initialized and set to print char ch3 = '';
		 * 
		 * String text1 = ""; //Non-Primitive data types of String with null values
		 * being initialized and set to print
		 * 
		 * System.out.println(n3+ "," +ch3); //Returns a error since, the primitive data
		 * type should have a value before screening System.out.println(text1);
		 * //Returns nothing(NULL) since, the non-primitive data type doesn't need a
		 * value while screening
		 */
	}

}
