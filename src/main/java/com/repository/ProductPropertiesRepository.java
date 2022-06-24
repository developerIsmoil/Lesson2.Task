package com.repository;

import com.entity.ProductProperties;
import com.projection.CustomProductProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "productProperties", collectionResourceRel = "list", excerptProjection = CustomProductProperties.class)
public interface ProductPropertiesRepository extends JpaRepository<ProductProperties, Long> {
}
