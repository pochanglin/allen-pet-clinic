package allen.springdemo.petclinicdata.services;

import allen.springdemo.petclinicdata.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
