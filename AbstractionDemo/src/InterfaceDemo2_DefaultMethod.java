
interface Sayable{
	default void Say(){
	System.out.println("Hello, this is default method");
	}
	void sayMore(String msg);
}

//---------------------------------------------------------------------

class Talk implements Sayable{
	public void sayMore(String msg){
		System.out.println(msg);
	}
}

//---------------------------------------------------------------------
//---------------------------------------------------------------------

public class InterfaceDemo2_DefaultMethod {

	public static void main(String[] args) {
		Talk dm = new Talk();
		dm.Say();
		dm.sayMore("Work is worship");

	}

}
