package dao;

import model.Customer;
import model.Product;
import org.hibernate.Session;
import sessions.Sessions;

import java.util.List;

public class Customer_ProductDAO {
    public List<Product> getAllProductsByCustomerID(int customerID) {
        List<Product> productList = null;

        Sessions sessions = new Sessions();
        Session session = sessions.getCurrentSession();
        session.beginTransaction();

        Customer customer = session.get(Customer.class, customerID);
        productList = customer.getProducts();
        productList.size();
        session.getTransaction().commit();
        return productList;
    }

    public List<Customer> getAllCustomersByProductID(int productID) {
        List<Customer> customerList = null;

        Sessions sessions = new Sessions();
        Session session = sessions.getCurrentSession();
        session.beginTransaction();

        Product product = session.get(Product.class, productID);
        customerList = product.getCustomers();
        customerList.size();

        return customerList;
    }
}
