import java.sql.*;

public class CRUD_Operations_Demo {
    // JDBC driver and database URL
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/demodb";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "Akash1305";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            
            // Create a table
            System.out.println("Creating table...");
            stmt = conn.createStatement();
            String sql = "CREATE TABLE employee " +
                         "(Emp_ID INTEGER not NULL, " +
                         " name VARCHAR(255), " +
                         " age INTEGER, " +
                         " department VARCHAR(255), " +
                         " PRIMARY KEY ( Emp_ID ))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");

            
            
            // Insert data into the table
            System.out.println("Inserting data into the table...");
            sql = "INSERT INTO employee (Emp_ID, name, age, department) " +
                  "VALUES (1234, 'Jhon Depp', 26, 'R&T'), " +
                  "(5678, 'Jane Smith', 23, 'IT')";
            stmt.executeUpdate(sql);
            System.out.println("Data inserted successfully...");
            
      

            // Select data from the table
            System.out.println("Selecting data from the table...");
            sql = "SELECT Emp_ID, name, age, department FROM employee";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                //Retrieve by column name
                int ID_No = rs.getInt("Emp_ID");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String dept = rs.getString("department");

                //Display values
                System.out.print("Employee ID: " + ID_No);
                System.out.print(", Name: " + name);
                System.out.print(", Age: " + age);
                System.out.println(", Department: " + dept);
            }
            rs.close();
            System.out.println("Data selected successfully...");

            
            
            // Update data in the table
            System.out.println("Updating data in the table...");
            sql = "UPDATE employee SET age = 22 WHERE Emp_ID = 1234";
            stmt.executeUpdate(sql);
            System.out.println("Data updated successfully...");

            
            
            // Delete data from the table
            System.out.println("Deleting data from the table...");
            sql = "DELETE FROM employee WHERE Emp_ID = 5678";
            stmt.executeUpdate(sql);
            System.out.println("Data deleted successfully...");

            // Clean-up environment
            stmt.close();
            conn.close();
        } catch(SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            // Finally block used to close resources
            try {
                if(stmt!=null) stmt.close();
            } catch(SQLException se2) {
            } // nothing we can do
            try {
                if(conn!=null) conn.close();
            } catch(SQLException se){
                se.printStackTrace();
            } // end finally try
        } // end try
    }
}
