package allen.springdemo.petclinic.repositories;

import allen.springdemo.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
