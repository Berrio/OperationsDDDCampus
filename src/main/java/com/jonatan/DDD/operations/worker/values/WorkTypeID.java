package com.jonatan.DDD.operations.worker.values;

import co.com.sofka.domain.generic.Identity;

public class WorkTypeID extends  Identity {
    public WorkTypeID() {
    }

    private WorkTypeID(String id) {
        super(id);
    }

    public static WorkTypeID of(String id) {
        return new WorkTypeID(id);
    }


}
