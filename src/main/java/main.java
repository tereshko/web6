import dao.Customer_ProductDAO;
import services.CustomerService;
import services.ProductService;


public class main {

    public static void main(String[] args) {

        RunSQLScript runSQLScript = new RunSQLScript();
        runSQLScript.run();

        ProductService productService = new ProductService();
        System.out.println(productService.getProductByID(5));

        CustomerService customerService = new CustomerService();
        System.out.println(customerService.getCustomerByID(1));

        Customer_ProductDAO customer_productDAO = new Customer_ProductDAO();
        System.out.println(customer_productDAO.getAllProductsByCustomerID(1));

        System.out.println(customer_productDAO.getAllCustomersByProductID(5));

    }
}
