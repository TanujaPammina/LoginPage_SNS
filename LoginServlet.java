import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Replace Scanner with this
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            // Same DB code as yours ✔
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "Tanu@1234"
            );

            String query = "SELECT * FROM users WHERE userId=? AND password=?";
            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1, username);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                out.println("<h2 style='color:green'>Login Successful</h2>");
            } else {
                out.println("<h2 style='color:red'>Invalid Credentials</h2>");
            }

            con.close();

        } catch (Exception e) {
            out.println(e);
        }
    }
}