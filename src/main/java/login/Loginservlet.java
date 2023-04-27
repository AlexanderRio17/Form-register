package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Loginservlet
 */
@WebServlet("/Loginservlet")
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/alex", "root", "root");
			String id=request.getParameter("stuid");
			String password1=request.getParameter("password");
			PreparedStatement ps=con.prepareStatement("select student_id from Login where student_id=? and password=?");
			ps.setString(1, id);
			ps.setString(2, password1); 
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				response.sendRedirect("RegisterFrom.jsp");
				return;
			}
			else {
				out.println("Incorrect Student id and Password");
				return;
			}
			 
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
