
import java.sql.*; //Step 1

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver"); //Step 2
		
		
		String url = "jdbc:mysql://localhost:3306/demodb";
		String uname = "root";
		String pass = "Akash1305";
		
		Connection con = DriverManager.getConnection(url, uname, pass); //Step 3
		
		
		String query = "select StudentName from student where StudentID=3";
		Statement st = con.createStatement(); //Steps 4
		
		
		ResultSet RS = st.executeQuery(query); //Step 5
		
		RS.next();
		String Name = RS.getString("StudentName"); 
		
		
		System.out.println(Name); //Step 6

		
		st.close();//Step 7
		con.close();
	}

}
