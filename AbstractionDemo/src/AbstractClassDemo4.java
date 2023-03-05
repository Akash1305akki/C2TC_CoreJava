import java.util.*;

abstract class Movie{
	String title;
	abstract void setTitle(String s);

}

//---------------------------------------------------------------------

class Mymovie extends Movie{
	void setTitle(String s){
		title = s;
		}
	String getTitle(){
	return title;
	}
}

//---------------------------------------------------------------------
//---------------------------------------------------------------------


public class AbstractClassDemo4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String title = s.nextLine();
		Mymovie m = new Mymovie();
		m.setTitle(title);

		System.out.println("The movie title is: "+m.getTitle());
		}
}
