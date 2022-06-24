package com.projection;

import com.entity.Owner;
import com.entity.Role;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Owner.class)
public interface CustomOwner {
    Long getId();

    String getFirstName();

    String getLastName();

    boolean getActive();

    Role getRole();

    String getPhone_number();
}
