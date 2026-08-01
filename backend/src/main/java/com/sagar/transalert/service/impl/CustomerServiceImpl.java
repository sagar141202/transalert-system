package com.sagar.transalert.service.impl;

import com.sagar.transalert.dto.request.CustomerRequest;
import com.sagar.transalert.dto.response.CustomerResponse;
import com.sagar.transalert.service.interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerResponse createCustomer(CustomerRequest request) {
        return null;
    }

    @Override
    public CustomerResponse getCustomer(Long id) {
        return null;
    }

    @Override
    public List<CustomerResponse> getAllCustomers() {
        return null;
    }

    @Override
    public CustomerResponse updateCustomer(Long id, CustomerRequest request) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }
}