package com.jonatan.DDD.operations.client.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ClientName implements ValueObject<String> {

    private String value;

    @Override
    public String value() {
        return value;
    }

    public ClientName(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()) {
            throw new IllegalArgumentException("Client name can't be blank");
        }

        if (this.value.length() < 4) {
            throw new IllegalArgumentException("Client name must be longer than five characters");
        }

        if (this.value.length() > 40) {
            throw new IllegalArgumentException("Client name must be smaller than fourty characters");
        }
    }

}
