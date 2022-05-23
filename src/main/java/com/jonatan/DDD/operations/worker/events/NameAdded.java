package com.jonatan.DDD.operations.worker.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.worker.values.WorkerName;

public class NameAdded  extends DomainEvent {

    private final WorkerName workerName;

    public NameAdded(WorkerName workerName) {
        super("operations.service.NameAdded");
        this.workerName = workerName;
    }

    public WorkerName getWorkerName() {
        return workerName;
    }
}
