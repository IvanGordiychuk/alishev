import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class PostgreServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter printWriter = response.getWriter();
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            printWriter.println("<h1>");
            printWriter.println(e + " Error! Driver not found!!!");
            printWriter.println("</h1>");
        }
        printWriter.println("<html>");
        //dispatcher.forward(request, response);
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgres://localhost:5432/java_ee_db",
            "postgres","");
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT title FROM books");
            printWriter.println("<h1>");
            while (rs.next())
                printWriter.println(rs.getString("title"));
            statement.close();
            printWriter.println("</h1>");
        } catch (SQLException throwables) {
            printWriter.println("<h1>");
            printWriter.println(throwables + " Error! Connecting to DataBase fail!");
            printWriter.println("</h1>");
        }
        printWriter.println("</html>");
    }
}
