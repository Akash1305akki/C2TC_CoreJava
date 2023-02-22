
public class SwitchDemo {

	public static void main(String[] args) {
		char ch = 'L';
		
		switch(ch) {
		case 'l':
			System.out.println(ch+" is lower case");
			break;
		case 'L':
			System.out.println(ch+" is upper case");
			break;
		default :
			System.out.println(ch+" is a digit");
			break;
		}

	}
}
