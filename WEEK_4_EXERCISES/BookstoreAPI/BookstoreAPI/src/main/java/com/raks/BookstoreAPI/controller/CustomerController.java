package com.raks.BookstoreAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.raks.BookstoreAPI.model.Customer;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private List<Customer> customers = new ArrayList<>();

    // POST method to create a new customer
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        customers.add(customer);
        return ResponseEntity.status(HttpStatus.CREATED).body(customer);
    }

    // Another method with form data handling
    @PostMapping("/register")
    public ResponseEntity<Customer> registerCustomer(@RequestParam("id") Long id,
                                                     @RequestParam("name") String name,
                                                     @RequestParam("email") String email,
                                                     @RequestParam("address") String address) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setEmail(email);
        customer.setAddress(address);

        customers.add(customer);
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Custom-Header", "Book Created")
                .body(customer);
    }
}
