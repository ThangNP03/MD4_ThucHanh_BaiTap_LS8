package ra.service;

import ra.model.Customer;

import java.util.List;

public interface ICustomerServiceIMPL {
    List<Customer> findAll();
    void save (Customer customer);
    Customer findById (int id);
    void update(int id , Customer customer);
    void delete(int id);
}
