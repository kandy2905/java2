/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class Registrartion extends HttpServlet {
    private String enter;
    private String cnum;
    private String email;
    private String sex;
    private String Option;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Name=request.getParameter("name");
            String Password = request.getParameter("password");
            String ReEnter = request.getParameter("password1");
            String ContactNumber = request.getParameter("cnum");
            String EmailAddress = request.getParameter("email");
            String Gender= request.getParameter("sex");
            String City = request.getParameter("Option");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at<h1>");
          out.println("<h1>Servlet NewServlet at "+Name+","+Password+","+Password+","+ContactNumber+","+EmailAddress+","+Gender+","+City+"</h1>");
            out.println("</body>");
            out.println("</html>");
            
            Mydb db = new Mydb();
            Connection con = db.getCon();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into newuser(Name,Password,ReEnter,ContactNumber,EmailAddress,Gender,City) values('"+Name+"','"+Password+"','"+Password+"',"+ContactNumber+",'"+EmailAddress+"','"+Gender+"','"+City+"')");
            out.println("Everything is recorded");
        } catch(SQLException ex){
            Logger.getLogger(Button.class.getName()).log(Level.SEVERE, null,ex);
            
        }
    }

    
}