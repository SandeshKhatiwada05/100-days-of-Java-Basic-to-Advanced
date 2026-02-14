package com.sandesh.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class FormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>Form</title></head><body>");
            out.println("<h2>Form Submission Example</h2>");
            out.println("<form method='post' action='FormServlet'>");
            out.println("Name: <input type='text' name='name' required><br><br>");
            out.println("Email: <input type='email' name='email' required><br><br>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
            out.println("<p><a href='index.jsp'>Back to Home</a></p>");
            out.println("</body></html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String name = nullToEmpty(request.getParameter("name"));
        String email = nullToEmpty(request.getParameter("email"));

        response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>Form Result</title></head><body>");
            out.println("<h2>Form Submitted Successfully</h2>");
            out.println("<p>Name: " + escape(name) + "</p>");
            out.println("<p>Email: " + escape(email) + "</p>");
            out.println("<p><a href='FormServlet'>Back to Form</a> | <a href='index.jsp'>Home</a></p>");
            out.println("</body></html>");
        }
    }

    private static String nullToEmpty(String s) { return s == null ? "" : s; }

    // super basic escaping for demo
    private static String escape(String s) {
        return s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;");
    }
}