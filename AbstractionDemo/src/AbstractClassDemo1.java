
abstract class Bike{
	abstract void run();
}

//---------------------------------------------------------------------

class Honda extends Bike{
	void run() {
		System.out.println("Honda is running");
	}
}

//---------------------------------------------------------------------

public class AbstractClassDemo1 {
	
	public static void main(String args[]) {
		Honda H = new Honda();
		H.run();
	}

}
