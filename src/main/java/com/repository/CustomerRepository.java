package com.repository;

import com.entity.Customer;
import com.entity.Role;
import com.projection.CustomCustomer;
import com.projection.CustomRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "customer", collectionResourceRel = "list", excerptProjection = CustomCustomer.class)
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
