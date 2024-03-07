import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class triageBE extends HttpServlet {
    public static void main(String[] args) {
        System.out.println("Hello, World! This is triageBE and its really cool!"); 
    }

    public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
      throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.print("Hello");

        // ... pseudocode
       
      }
}