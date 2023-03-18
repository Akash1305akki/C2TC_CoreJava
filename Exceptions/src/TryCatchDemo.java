
public class TryCatchDemo {
	
	public static void main(String[] args) {
	    int[] myNumbers = {1, 2, 3};
		try {
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Index out of bound error will occur");
		    }
	}

}
