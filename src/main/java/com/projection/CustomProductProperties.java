package com.projection;

import com.entity.Product;
import com.entity.ProductProperties;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = ProductProperties.class)
public interface CustomProductProperties {
    Long getId();

    String getKey();

    String getValue();

    Product getProduct();
}
