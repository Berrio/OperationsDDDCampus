package com.jonatan.DDD.operations.client.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofka.domain.generic.ValueObject;

public class TypeID extends Identity {
    public TypeID() {
    }

    private TypeID(String id) {
        super(id);
    }

    public static TypeID of(String id) {
        return new TypeID(id);
    }
}
