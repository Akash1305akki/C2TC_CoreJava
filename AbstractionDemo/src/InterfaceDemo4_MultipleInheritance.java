
//It is easy to achieve "Multiple Inheritance" in JAVA using Interface.
//"Multiple Inheritance" cannot be achieved generally in JAVA.

interface Interface1
{
	public void myMethod();
}

//---------------------------------------------------------------------

interface Interface2
{
	public void MyOtherMethod();
}
//---------------------------------------------------------------------

class DemoClass implements Interface1, Interface2 {
	public void myMethod() {
		System.out.println("Inside Interface_1");
		}
	
	public void MyOtherMethod() {
		System.out.println("Inside Interface_2");
		}
	}

//---------------------------------------------------------------------
//---------------------------------------------------------------------

public class InterfaceDemo4_MultipleInheritance{

	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
		obj.myMethod();
		obj.MyOtherMethod();
	}

}
