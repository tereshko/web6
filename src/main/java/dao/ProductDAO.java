package dao;

import model.Product;
import org.hibernate.Session;
import sessions.Sessions;

public class ProductDAO {


    public Product getProductById(int productId) {
        Sessions sessions = new Sessions();
        Session session = sessions.getCurrentSession();

        session.beginTransaction();
        Product product = session.get(Product.class, productId);
        session.getTransaction().commit();
        return product;
    }
}
