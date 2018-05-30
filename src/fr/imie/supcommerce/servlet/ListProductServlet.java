package fr.imie.supcommerce.servlet;

import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.model.Product;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ListProductServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        List<Product> products = ProductDao.getAllProducts();

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        for (Product product : products) {
            out.append("<br>" + product.toString() + "<br>");
        }
    }
}
