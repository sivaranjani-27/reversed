import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FormServlet extends HttpServlet {
protected void doPost(HttpServletRequest request, HttpServletResponse
response)
throws ServletException, IOException {
String name = request.getParameter("name");
String email = request.getParameter("email");
response.setContentType("text/html");
response.getWriter().println("<h1>Form Submitted Successfully</h1>");
response.getWriter().println("<p>Name: " + name + "</p>");
response.getWriter().println("<p>Email: " + email + "</p>");
}
}