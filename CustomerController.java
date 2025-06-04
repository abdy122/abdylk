package com.toko.controller;

import com.toko.model.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> daftarCustomer = new ArrayList<>();
    
    // Create
    public void tambahCustomer(Customer customer) {
        daftarCustomer.add(customer);
    }
    
    // Read
    public List<Customer> getAllCustomer() {
        return daftarCustomer;
    }
    
    public Customer getCustomerById(String idCustomer) {
        for (Customer customer : daftarCustomer) {
            if (customer.getIdCustomer().equals(idCustomer)) {
                return customer;
            }
        }
        return null;
    }
    
    // Update
    public boolean updateCustomer(Customer customerUpdate) {
        for (int i = 0; i < daftarCustomer.size(); i++) {
            if (daftarCustomer.get(i).getIdCustomer().equals(customerUpdate.getIdCustomer())) {
                daftarCustomer.set(i, customerUpdate);
                return true;
            }
        }
        return false;
    }
    
    // Delete
    public boolean hapusCustomer(String idCustomer) {
        for (Customer customer : daftarCustomer) {
            if (customer.getIdCustomer().equals(idCustomer)) {
                daftarCustomer.remove(customer);
                return true;
            }
        }
        return false;
    }
    
    // Search by name
    public List<Customer> cariCustomerByName(String nama) {
        List<Customer> result = new ArrayList<>();
        for (Customer customer : daftarCustomer) {
            if (customer.getNama().toLowerCase().contains(nama.toLowerCase())) {
                result.add(customer);
            }
        }
        return result;
    }
}