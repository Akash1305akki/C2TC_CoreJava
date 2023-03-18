
public class ExtendingThread extends Thread {

	public static void main(String[] args) {
		ExtendingThread thread = new ExtendingThread();
		thread.start();
		System.out.println("This code is outside of the thread");
		}
		public void run() {
		  System.out.println("This code is running in a thread");
		}
}
