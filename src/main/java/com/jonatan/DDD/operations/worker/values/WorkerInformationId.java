package com.jonatan.DDD.operations.worker.values;

import co.com.sofka.domain.generic.Identity;

public class WorkerInformationId extends Identity {

    public WorkerInformationId() {
    }

    private WorkerInformationId(String id) {
        super(id);
    }

    public static WorkerInformationId of(String id) {
        return new WorkerInformationId(id);
    }


}
