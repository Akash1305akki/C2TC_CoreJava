
public class CreatingThreadDemo {
	
	public class Main1 extends Thread {
		  public void run() {
		    System.out.println("This code is running in a Thread Class");
		  }
		}
	
	public class Main2 implements Runnable {
		  public void run() {
		    System.out.println("This code is running in Runnable Interface1111");
		  }
		}
}
