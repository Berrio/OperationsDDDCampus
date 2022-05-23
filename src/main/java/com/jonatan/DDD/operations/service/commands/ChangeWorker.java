package com.jonatan.DDD.operations.service.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.worker.values.WorkerID;

public class ChangeWorker extends Command {

    private final ServiceID serviceID;
    private final WorkerID workerID;

    public ChangeWorker(ServiceID serviceID, WorkerID workerID) {
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
