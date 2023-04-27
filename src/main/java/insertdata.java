import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insertdata {
	
	
	private String url="jdbc:mysql://localhost:3306/alex";
	private String username="root";
	private String password="root";
	private String DbDriver="com.mysql.jdbc.Driver";
	
	public void loadDriver(String db)
	{
		try {
			Class.forName(db);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}
	
	public Connection getConnection()
	{
		Connection con=null;
		try {
			con =DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		}
	public String entry(member mem)
	
	{
		loadDriver(DbDriver);
		Connection con = getConnection();
		String result="Data insert successfully..!";
		  
		String sql="insert into Regsiter values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, mem.getFname());
			ps.setString(2, mem.getId());
			ps.setString(3, mem.getEmail());
			ps.setString(4, mem.getMobile());
			ps.setString(5, mem.getAddress());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			result="Data not entered...!";
		}
		
		return result;
		
	}

	

}
