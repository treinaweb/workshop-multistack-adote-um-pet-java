package br.com.treinaweb.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.treinaweb.adoteumpet.core.exceptions.PetNotFoundException;
import br.com.treinaweb.adoteumpet.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id) {
        return findById(id)
            .orElseThrow(PetNotFoundException::new);
    }

}
