import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/alex";
		String username="root";
		String password="root";
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connect to Database...");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error..!");
			e.printStackTrace();
		}

	}

}
