
package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;






import java.sql.*;  
class Update{  
	public static void main(String[] args) throws ClassNotFoundException {  
try{  
	
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","");  
//here sonoo is database name, root is username and password 
String sql = "update customers set name='honey' where id =1";

Statement statement = con.createStatement();

 
int rowsUpdated = statement.executeUpdate(sql);

if (rowsUpdated > 0) {
	
}
    System.out.println("An existing user was updated successfully!");


con.close();  
}
catch(Exception e){ System.out.println(e);
}  
}  
}