package com.jonatan.DDD.operations.worker.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class WorkTypeName  implements ValueObject<String> {

    private String value;

    @Override
    public String value() {
        return value;
    }

    public WorkTypeName(String value) {

        this.value = Objects.requireNonNull(value);
        if (value.isBlank()) {
            throw new IllegalArgumentException("The  WorkTypeName can't be blank");
        }
        if (value.length() > 100) {
            throw new IllegalArgumentException("The  WorkTypeName can't be too long");
        }
        if (value.length() < 5) {
            throw new IllegalArgumentException("The  WorkTypeName can't be too short");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkTypeName that = (WorkTypeName) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
