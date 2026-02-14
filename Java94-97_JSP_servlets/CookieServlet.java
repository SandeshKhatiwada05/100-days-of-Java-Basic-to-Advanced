package com.sandesh.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CookieServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create/update a demo cookie
        Cookie cookie = new Cookie("user", "JavaStudent");
        cookie.setMaxAge(60 * 60); // 1 hour
        cookie.setPath(request.getContextPath().isEmpty() ? "/" : request.getContextPath());
        response.addCookie(cookie);

        response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>Cookies</title></head><body>");
            out.println("<h2>Cookie Created: user=JavaStudent (1 hour)</h2>");
            out.println("<h3>All Cookies Sent By Browser:</h3>");
            out.println("<ul>");
            Cookie[] cookies = request.getCookies();
            if (cookies != null && cookies.length > 0) {
                for (Cookie c : cookies) {
                    out.println("<li>" + c.getName() + " = " + c.getValue() + "</li>");
                }
            } else {
                out.println("<li>(No cookies yet — refresh once)</li>");
            }
            out.println("</ul>");
            out.println("<p><a href='index.jsp'>Back to Home</a></p>");
            out.println("</body></html>");
        }
    }
}