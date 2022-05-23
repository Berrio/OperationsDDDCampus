package com.jonatan.DDD.operations.service.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.worker.values.WorkerID;

public class WorkerCreate extends DomainEvent {

    private final WorkerID workerID;

    public WorkerCreate(WorkerID workerID) {
        super("operations.service.WorkerCreate");
        this.workerID = workerID;
    }

    public WorkerID getWorkerID() {
        return workerID;
    }
}
