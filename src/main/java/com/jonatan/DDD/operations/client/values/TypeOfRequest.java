package com.jonatan.DDD.operations.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TypeOfRequest implements ValueObject<String> {

    private String value;

    @Override
    public String value() {
        return value;
    }

    public TypeOfRequest(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Type Of Request can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Type Of Request must be longer than five characters");
        }

        if (this.value.length() > 30) {
            throw new IllegalArgumentException("Type Of Request must be smaller than Thirty characters");
        }
    }
}
