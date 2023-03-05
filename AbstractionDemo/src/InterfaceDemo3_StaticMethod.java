
interface In1
{
	int a = 10;
	static void display()
	{
		System.out.println("This is Static Method");
	}
}


//---------------------------------------------------------------------
//---------------------------------------------------------------------

public class InterfaceDemo3_StaticMethod implements In1 {

	public static void main(String[] args) {
		
		In1.display();
		System.out.println("The value inside this interface is: "+a);
	}
}
