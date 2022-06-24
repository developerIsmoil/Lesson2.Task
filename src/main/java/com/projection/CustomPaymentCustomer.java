package com.projection;

import com.entity.Customer;
import com.entity.PaymentCustomer;
import com.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = PaymentCustomer.class)
public interface CustomPaymentCustomer {
    Long getId();

    Date getDate();

    Double getPrice();

    Product getProduct();

    Customer getCustomer();
}
