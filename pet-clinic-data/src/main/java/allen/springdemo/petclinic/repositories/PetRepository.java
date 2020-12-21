package allen.springdemo.petclinic.repositories;

import allen.springdemo.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
