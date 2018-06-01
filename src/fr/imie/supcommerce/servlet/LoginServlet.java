package fr.imie.supcommerce.servlet;

import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        for (int i = 0; i < 20; i++) {
            Product product = new Product();
            product.setDescription("Ma description");
            product.setName("Mon premier produit");

            Random r = new Random();
            float random = 10 + r.nextFloat() * (500 - 10);
            product.setPrice(random);

            ProductDao.addProduct(product);
        }

        HttpSession session = req.getSession();
        if (username != null)
            session.setAttribute("username", username);

        resp.sendRedirect("/listProduct");
    }
}
