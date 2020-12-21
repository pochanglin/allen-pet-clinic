package allen.springdemo.petclinic.repositories;

import allen.springdemo.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
