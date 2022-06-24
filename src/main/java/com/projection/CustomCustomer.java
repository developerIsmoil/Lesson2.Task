package com.projection;

import com.entity.Customer;
import com.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Customer.class)
public interface CustomCustomer {
    Long getId();

    String getFullName();

    String getPhoneNumber();

    String getEmail();

    Product getProduct();
}
