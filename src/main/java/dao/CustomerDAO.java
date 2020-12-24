package dao;

import model.Customer;
import org.hibernate.Session;
import sessions.Sessions;

public class CustomerDAO {

    public Customer getCustomerById(int customerId) {
        Sessions sessions = new Sessions();
        Session session = sessions.getCurrentSession();

        session.beginTransaction();
        Customer customer = session.get(Customer.class, customerId);
        session.getTransaction().commit();
        return customer;
    }
}
