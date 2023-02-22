
public class ForEachLoopDemo {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		char ch[] = {'j','a','v','a'};
		String s[] = {"java","programming"};
		
		for(int i : a) {
			System.out.println(i);
		}
		
		System.out.println("----------");
		
		for(char j : ch) {
			System.out.println(j);
		}
		
		System.out.println("----------");
		
		for(String k : s) {
			System.out.println(k);
		}
		
	}

}
