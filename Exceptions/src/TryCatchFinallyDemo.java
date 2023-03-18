
public class TryCatchFinallyDemo {

	public static void main(String[] args) {
		int[] myNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		try {
		      System.out.println(myNumbers[10]);
		    } catch (Exception e) {
		      System.out.println("Index out of bound error will occur");
		    } finally {
		      System.out.println("Executing Finally Block.");
		    }
	}

}
