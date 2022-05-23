package com.jonatan.DDD.operations.service.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.worker.values.WorkerID;
import com.jonatan.DDD.operations.worker.values.WorkerName;

public class WorkerAdded extends DomainEvent {

    private final ServiceID serviceID;
    private final WorkerID workerID;
    private final WorkerName workerName;

    public WorkerAdded(ServiceID serviceID, WorkerID workerID, WorkerName workerName) {
        super("operations.service.WorkerAdded");
        this.serviceID = serviceID;
        this.workerID = workerID;
        this.workerName = workerName;
    }

    public ServiceID getServiceID() {
        return serviceID;
    }

    public WorkerID getWorkerID() {
        return workerID;
    }

    public WorkerName getWorkerName() {
        return workerName;
    }
}
