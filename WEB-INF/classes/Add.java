import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io;

public class Add extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		PrintWriter p = res.getWriter();
		p.println("hello servlet");
	}
}