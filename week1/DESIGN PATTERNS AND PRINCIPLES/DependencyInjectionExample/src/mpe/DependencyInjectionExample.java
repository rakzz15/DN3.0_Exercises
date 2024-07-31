package mpe;

public class DependencyInjectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Creating repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject repository into service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use service to find customer
        Customer customer = customerService.getCustomerById(1);
        System.out.println("Customer ID: " + customer.getId() + ", Name: " + customer.getName());

	}

}
