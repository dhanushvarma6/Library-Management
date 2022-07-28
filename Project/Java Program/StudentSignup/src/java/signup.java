
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
public class signup extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String uname = request.getParameter("uname");
            String pass = request.getParameter("password");
            String rpass = request.getparameter("Re=password");
            Database db= new Database();
            Connection con= db.getCon();
            Statement stmt = con.createStatement();
            String password = null;
            String repassword = null;
            stmt.executeUpdate("insert into user (uname,password,Re-password) values('"+uname+"','"+password+",'"+repassword+"')");
            System.out.println("Data Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }

 