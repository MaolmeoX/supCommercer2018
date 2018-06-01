package fr.imie.supcommerce.servlet;

import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/auth/addProduct")
public class InsertSomeProductServlet extends HttpServlet {

/*    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        Product product = new Product();
        product.setDescription("Ma description");
        product.setName("Mon premier produit");
        product.setPrice(112.85F);

        ProductDao.addProduct(product);
    }*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/addProduct.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Product product = new Product();

        String name = req.getParameter("name");
        product.setName(name);

        String description = req.getParameter("description");
        product.setDescription(description);

        String price = req.getParameter("price");
        product.setPrice(Float.valueOf(price));

        Long lastInsertedId = ProductDao.addProduct(product);

        resp.sendRedirect("/showProduct?id=" + lastInsertedId);
    }
}
