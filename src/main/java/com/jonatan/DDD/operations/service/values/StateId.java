package com.jonatan.DDD.operations.service.values;

import co.com.sofka.domain.generic.Identity;

public class StateId extends Identity {
    public StateId() {
    }

    private StateId(String id) {
        super(id);
    }

    public static StateId of(String id) {
        return new StateId(id);
    }
}
