package com.crudplusAngular.crud_fullstack_angular.controller;

import com.crudplusAngular.crud_fullstack_angular.entity.Customer;
import com.crudplusAngular.crud_fullstack_angular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//localhost:8080/api/customers
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //localhost:8080/api/customers/create
    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    //localhost:8080/api/customers
    @GetMapping("")
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    //localhost:8080/api/customers
    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    @PutMapping
    public Customer upcateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.findById(customer.getId());
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setEmail(customer.getEmail());

        return customerService.update(customerDb);
    }
}
