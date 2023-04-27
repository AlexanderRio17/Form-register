import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Retrivaldata {
	public static void main (String args)
	{
	
	
		
	try {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alex", "root", "root");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from reg");
		       
		        ResultSet resultSet=preparedStatement.executeQuery();
		        while(resultSet.next()){
		             String name=resultSet.getString("fname");
		             String id=resultSet.getString("id");
		             String email=resultSet.getString("email");
		             String mobile=resultSet.getString("mobile");
		             String address=resultSet.getString("address");
		            
		             System.out.println(name+" "+id+" "+email+""+mobile+""+address);
		        }
		} catch (SQLException e) {
		System.out.println("Error while connecting to the database");
		}

}
}
