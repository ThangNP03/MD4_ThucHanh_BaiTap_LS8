package ra.service;

import ra.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceIMPL implements ICustomerServiceIMPL{
     public static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add( new Customer(1, "Nguyễn Phúc Thắng", "thang@rikkei.academy", "NgheAn"));
        customerList.add( new Customer(2, "Nguyễn Thi Ánh", "anh@rikkei.academy", "NgheAn"));
        customerList.add( new Customer(3, "Đặng Thanh Huyền", "huyen@rikkei.academy", "NgheAn"));
        customerList.add( new Customer(4, "Lương Thị Ba", "ba@rikkei.academy", "NgheAn"));
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }

    @Override
    public void save(Customer customer) {

    }

    @Override
    public Customer findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Customer customer) {

    }

    @Override
    public void delete(int id) {

    }
}
