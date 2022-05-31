package br.com.treinaweb.adoteumpet.core.exceptions;

import javax.persistence.EntityNotFoundException;

public class PetNotFoundException extends EntityNotFoundException {

    public PetNotFoundException() {
        super("Pet não encontrado");
    }

    public PetNotFoundException(String message) {
        super(message);
    }

}
