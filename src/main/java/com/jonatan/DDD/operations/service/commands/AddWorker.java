package com.jonatan.DDD.operations.service.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.worker.values.WorkerID;
import com.jonatan.DDD.operations.worker.values.WorkerName;

public class AddWorker extends Command {

    private final ServiceID serviceID;
    private final WorkerID workerID;
    private final WorkerName workerName;

    public AddWorker(ServiceID serviceID, WorkerID workerID, WorkerName workerName) {

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
