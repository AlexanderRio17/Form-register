

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Insert() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
        response.setContentType("text/html");  
        out.println("<html><body>");  
        try 
        {  
        	Class.forName("com.mysql.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alex", "root", "root");  
              
            Statement stmt = con.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from Regsiter");  
            out.println("<table border=1 width=80% height=10%>");  
            out.println("<tr><th>Name</th><th>ID</th><th>Email</th><th>Mobile</th><th>Address</th><tr>");  
            while (rs.next()) 
            {  
                String name = rs.getString("name");  
                String id = rs.getString("Id");  
                String email = rs.getString("email"); 
                String mobile = rs.getString("mobile"); 
                String address = rs.getString("address"); 
                
                out.println("<tr><td>" + name + "</td><td>" + id + "</td><td>" + email + "</td><td>" + mobile + "</td><td>" +address + "</td></tr>");   
            }  
            out.println("</table>");  
            out.println("</html></body>");  
            con.close();  
           }  
            catch (Exception e) 
           {  
            out.println("error");  
        }  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		String name=request.getParameter("fname");
		String id=request.getParameter("Id");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		member mem= new member(name, id, email, mobile, address);
		insertdata ins=new insertdata();
		String result=ins.entry(mem);
		response.getWriter().print(result); 
	}

}
