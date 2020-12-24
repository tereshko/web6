package services;

import dao.CustomerDAO;
import model.Customer;

public class CustomerService {
    private CustomerDAO customerDAO = new CustomerDAO();;

    public Customer getCustomerByID(int customerID) {
        return customerDAO.getCustomerById(customerID);
    }
}
