package com.sandesh.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession(true);

        // Set a username attribute if not present
        if (session.getAttribute("username") == null) {
            session.setAttribute("username", "JavaLearner");
        }
        // Simple visit counter
        Integer count = (Integer) session.getAttribute("visits");
        count = (count == null) ? 1 : count + 1;
        session.setAttribute("visits", count);

        response.setContentType("text/html; charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html><html><head><meta charset='UTF-8'><title>Session</title></head><body>");
            out.println("<h2>Session Info</h2>");
            out.println("<p>Session ID: " + session.getId() + "</p>");
            out.println("<p>Username: " + session.getAttribute("username") + "</p>");
            out.println("<p>Visits this session: " + count + "</p>");
            out.println("<p><a href='SessionServlet'>Refresh</a> | <a href='index.jsp'>Home</a></p>");
            out.println("</body></html>");
        }
    }
}