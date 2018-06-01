package fr.imie.supcommerce.servlet;

import fr.imie.supcommerce.dao.ProductDao;
import fr.imie.supcommerce.model.Product;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(urlPatterns="/auth/basicInsert")
public class InsertSomeProductServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        Product product = new Product();
        product.setDescription("Ma description");
        product.setName("Mon premier produit");
        product.setPrice(112.85F);

        ProductDao.addProduct(product);
    }
}
