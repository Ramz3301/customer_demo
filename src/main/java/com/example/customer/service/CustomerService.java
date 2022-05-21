package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {

    private final CustomerRepository customerRepository;

    public Optional<Customer> findById(Long id) {
        log.info("Customer Service get by id {}", id);
        return customerRepository.findById(id);
    }

    public void save(Customer customer) {
        log.info("Customer Service save {}", customer);
        customerRepository.save(customer);
    }

    public void saveAll(List<Customer> customerList) {
        log.info("Customer Service save all");
        customerRepository.saveAll(customerList);
    }

    public List<Customer> findAll() {
        log.info("Customer Service find all");
        return customerRepository.findAll();
    }

    public void deleteById(Long id) {
        log.info("Customer Service delete by id {}", id);
        customerRepository.deleteById(id);
    }
}
