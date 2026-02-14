package com.sandesh.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DBServlet extends HttpServlet {

    // MySQL connection details (as provided)
    private static final String URL  = "jdbc:mysql://localhost:3306/java?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "admin";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><meta charset='UTF-8'><title>Student Records</title></head><body>");
            out.println("<h2>Student Records</h2>");

            // Optional: ensure driver is loaded (modern drivers auto-register)
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ignored) { }

            String sql = "SELECT rollno, fullname, faculty, level, gender, hobbies FROM studentt";

            try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
                 PreparedStatement ps = conn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {

                out.println("<table border='1' cellspacing='0' cellpadding='6'>");
                out.println("<tr><th>Roll No</th><th>Full Name</th><th>Faculty</th><th>Level</th><th>Gender</th><th>Hobbies</th></tr>");

                boolean any = false;
                while (rs.next()) {
                    any = true;
                    out.println("<tr>");
                    out.println("<td>" + rs.getInt("rollno") + "</td>");
                    out.println("<td>" + escape(rs.getString("fullname")) + "</td>");
                    out.println("<td>" + escape(rs.getString("faculty")) + "</td>");
                    out.println("<td>" + escape(rs.getString("level")) + "</td>");
                    out.println("<td>" + escape(rs.getString("gender")) + "</td>");
                    out.println("<td>" + escape(rs.getString("hobbies")) + "</td>");
                    out.println("</tr>");
                }
                if (!any) {
                    out.println("<tr><td colspan='6'>(No rows found in table java.studentt)</td></tr>");
                }
                out.println("</table>");
            } catch (SQLException e) {
                out.println("<p style='color:red;'>Database error: " + escape(e.getMessage()) + "</p>");
                out.println("<p>Verify that:</p>");
                out.println("<ul>");
                out.println("<li>MySQL is running and accessible at localhost:3306</li>");
                out.println("<li>Database 'java' exists and table 'studentt' has columns: rollno, fullname, faculty, level, gender, hobbies</li>");
                out.println("<li>Credentials USER=" + USER + " and PASS=" + PASS + " are correct</li>");
                out.println("</ul>");
            }

            out.println("<p><a href='index.jsp'>Back to Home</a></p>");
            out.println("</body></html>");
        }
    }

    private static String escape(String s) {
        if (s == null) return "";
        return s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }
}