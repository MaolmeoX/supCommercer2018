package fr.imie.supcommerce.servlet;

import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ShowProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        Product product = ProductDao.findProduct(Long.parseLong(id));
        if(product != null){
            out.append(product.toString() + "<br>");
        } else {
            out.append("<h1>Le produit n'existe pas !!</h1>");
        }
    }
}
