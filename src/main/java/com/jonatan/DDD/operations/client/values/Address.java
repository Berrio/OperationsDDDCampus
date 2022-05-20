package com.jonatan.DDD.operations.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Address implements ValueObject<String> {

    private final String value;

    public Address(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Address can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Address must be longer than five characters");
        }

        if (this.value.length() > 30) {
            throw new IllegalArgumentException("Address must be smaller than thirty characters");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
