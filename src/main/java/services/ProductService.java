package services;

import dao.ProductDAO;
import model.Product;

public class ProductService {
    private ProductDAO productDAO = new ProductDAO();

    public Product getProductByID(int id) {
        return productDAO.getProductById(id);
    }

}
