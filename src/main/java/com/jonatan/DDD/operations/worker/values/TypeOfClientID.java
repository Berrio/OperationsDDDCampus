package com.jonatan.DDD.operations.worker.values;

import co.com.sofka.domain.generic.Identity;

public class TypeOfClientID extends Identity {
    public TypeOfClientID() {
    }

    private TypeOfClientID(String id) {
        super(id);
    }

    public static TypeOfClientID of(String id) {
        return new TypeOfClientID(id);
    }


}