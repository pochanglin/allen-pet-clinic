package allen.springdemo.petclinic.repositories;

import allen.springdemo.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
