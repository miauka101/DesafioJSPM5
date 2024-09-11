package com.desafio;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        int num = Integer.parseInt(request.getParameter("num"));
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        String parity = (num % 2 == 0) ? "par" : "impar";
        
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Resultados</h1>");
        response.getWriter().println("<p>Factorial de " + num + " es: " + factorial + "</p>");
        response.getWriter().println("<p>El número " + num + " es " + parity + "</p>");
        response.getWriter().println("<a href='index.jsp'>Volver a la lista</a>");
        response.getWriter().println("</body></html>");
    }
}
