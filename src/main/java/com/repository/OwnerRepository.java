package com.repository;

import com.entity.Owner;
import com.projection.CustomOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "owner", collectionResourceRel = "list", excerptProjection = CustomOwner.class)
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
