package com.jonatan.DDD.operations.client.values;

import co.com.sofka.domain.generic.ValueObject;

public class StateName implements ValueObject<String> {

    private String value;

    @Override
    public String value() {
        return value;
    }
}
