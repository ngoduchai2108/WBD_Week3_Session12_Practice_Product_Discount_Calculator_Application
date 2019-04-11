import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet",urlPatterns = "/calculator")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("ProductDescription");
        float price = Float.parseFloat(request.getParameter("ListPrice"));
        float percent = Float.parseFloat(request.getParameter("DiscountPercent"));
        float disCountAmount = price * percent /10;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Description: "+product+" <h1/>");
        writer.println("<h1>List Price: "+price+" <h1/>");
        writer.println("<h1>DiscountPercent: "+percent+" <h1/>");
        writer.println("<h1>DisCountAmount: "+disCountAmount+" <h1/>");
        writer.println("<html/>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
