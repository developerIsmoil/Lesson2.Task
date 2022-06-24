package com.projection;

import com.entity.Role;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Role.class)
public interface CustomRole {
    Long getId();

    String getName();
}
