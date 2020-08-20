package allen.springdemo.petclinicdata.services;

import allen.springdemo.petclinicdata.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
