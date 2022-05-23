package com.jonatan.DDD.operations.service.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.worker.values.WorkerID;
import com.jonatan.DDD.operations.worker.values.WorkerName;

public class WorkerAdded extends DomainEvent {

    private final ServiceID serviceID;
    private final WorkerID workerID;


    public WorkerAdded(ServiceID serviceID, WorkerID workerID) {
        super("operations.service.WorkerAdded");
        this.serviceID = serviceID;
        this.workerID = workerID;

    }

    public ServiceID getServiceID() {
        return serviceID;
    }

    public WorkerID getWorkerID() {
        return workerID;
    }


}
