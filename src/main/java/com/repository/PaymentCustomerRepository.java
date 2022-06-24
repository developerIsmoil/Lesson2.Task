package com.repository;

import com.entity.PaymentCustomer;
import com.projection.CustomPaymentCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "paymentCustomer", collectionResourceRel = "list", excerptProjection = CustomPaymentCustomer.class)
public interface PaymentCustomerRepository extends JpaRepository<PaymentCustomer, Long> {
}
