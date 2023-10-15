package cm.User;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.DeploymentException;
import javax.servlet.http.HttpServlet;
import java.io.*;
import java.util.*;



public class AddAccount extends HttpServlet {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws DeploymentException,ServletException,IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");

		String FirstName = req.getParameter("user_firstname");
		String LastName = req.getParameter("user_lastname");
		Long Number = Long.parseLong(req.getParameter("user_number"));
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date parsed = format.parse(req.getParameter("user_dob"));
			@SuppressWarnings("deprecation")
			String date1 = Integer.toString(parsed.getYear()+120);
			out.println("DOB : " + date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String Add1 = req.getParameter("user_add1");
		String Add2 = req.getParameter("user_add2");
		String gender = req.getParameter("user_gender");
		Long accno = Long.parseLong(req.getParameter("user_account"));
		String acctype = req.getParameter("user_type");
		
		out.println("<h1>");
		out.println("First Name : " + FirstName);
		out.println("</h1>");
		out.println("Last Name : " + LastName);
		out.println("Phone No: " + Number);
		out.println("Address 1 : " + Add1);
		out.println("Address 2 : " + Add2);
		out.println("Gender : " + gender);
		out.println("Account Number : " + accno);
		out.println("Account Type : " + acctype);




		
		
	}
}
