package com.challenge.hexalab.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class EntityNotFoundException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public EntityNotFoundException() {
        super("Entity not found.");
    }
}
