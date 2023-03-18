
public class ConcurrencyInThread extends Thread {
	  public static int amount = 0;

	public static void main(String[] args) {
		ConcurrencyInThread thread = new ConcurrencyInThread();
	    thread.start();
	    System.out.println(amount);
	    System.out.println("Outside run");
	    amount++;
	    System.out.println(amount);
	  }

	  public void run() {
		  System.out.println("Inside run");
	      amount++;
	      System.out.println(amount);
	}

}
