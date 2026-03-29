import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SignupServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Connection con = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;
        ResultSet rs = null;

        try {
            // 1. Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to DB
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "Tanu@1234"
            );

            // 3. Check if user already exists
            String check = "SELECT * FROM users WHERE userId=?";
            ps1 = con.prepareStatement(check);
            ps1.setString(1, username);

            rs = ps1.executeQuery();

            if (rs.next()) {
                // User exists
                out.println("<h3 style='color:red;'>User already exists!</h3>");
                out.println("<a href='register.html'>Try again</a>");
            } else {
                // 4. Insert new user
                String insert = "INSERT INTO users(userId, password) VALUES (?, ?)";
                ps2 = con.prepareStatement(insert);
                ps2.setString(1, username);
                ps2.setString(2, password);

                int result = ps2.executeUpdate();

                if (result > 0) {
                    // 5. Redirect to login page
                    response.sendRedirect("login.html");
                } else {
                    out.println("<h3>Signup failed!</h3>");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error occurred!</h3>");
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps1 != null) ps1.close();
                if (ps2 != null) ps2.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}