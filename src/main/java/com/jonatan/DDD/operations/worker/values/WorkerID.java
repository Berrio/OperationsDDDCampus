package com.jonatan.DDD.operations.worker.values;

import co.com.sofka.domain.generic.Identity;

public class WorkerID extends  Identity {
    public WorkerID() {
    }

    private WorkerID(String id) {
        super(id);
    }

    public static WorkerID of(String id) {
        return new WorkerID(id);
    }


}
