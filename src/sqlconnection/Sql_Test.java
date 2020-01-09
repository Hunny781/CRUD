package sqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;






import java.sql.*;  
class Sql_Test{  
	public static void main(String[] args) throws ClassNotFoundException {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/testdb","root","");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from CUSTOMERS");  
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"   "+rs.getInt(5)) ; 
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  