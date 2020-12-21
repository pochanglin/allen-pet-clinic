package allen.springdemo.petclinic.services;

import allen.springdemo.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);

}
