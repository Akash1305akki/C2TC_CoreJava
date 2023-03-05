
interface Vehicle
{
	void getMileage();
}

//---------------------------------------------------------------------

class R15 implements Vehicle
{
	public void getMileage(){
		System.out.print("Mileage is 40 Km/L");
		}
}

//---------------------------------------------------------------------
//---------------------------------------------------------------------


public class InterfaceDemo1 {

	public static void main(String[] args) {
		
		R15 bike = new R15();
		bike.getMileage();

	}
}
