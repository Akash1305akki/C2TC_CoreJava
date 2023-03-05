
abstract class Bikes{
	
	String name = "RE Himalyan";
	
	void Biker(){
		System.out.println("Bought my new bike !!!");
	}
	
	abstract void Run();
	
	void ChangeGear() {
		System.out.println("Gear Changeed ..!");
	}
}

//---------------------------------------------------------------------

class RE extends Bikes{
	void Run() {
		System.out.println("RE is on the move...");
	}
}

//---------------------------------------------------------------------

public class AbstractionClass3 {

	public static void main(String[] args) {
		
		RE R = new RE();
		R.Biker();
		R.Run();
		R.ChangeGear();
		System.out.println("My bike model is: "+R.name);

	}

}
