package ra.controller;

import ra.model.Customer;
import ra.service.CustomerServiceIMPL;
import ra.service.ICustomerServiceIMPL;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CustomerController extends HttpServlet {
    private ICustomerServiceIMPL customerServiceIMPL = new CustomerServiceIMPL();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    private  void  getListCustomer(HttpServletRequest request, HttpServletResponse response){
        List<Customer> customerList = customerServiceIMPL.findAll();
        request.setAttribute("ListCustomer", customerList);

    }
}
