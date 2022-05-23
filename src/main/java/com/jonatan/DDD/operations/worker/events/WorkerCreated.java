package com.jonatan.DDD.operations.worker.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.worker.Information;
import com.jonatan.DDD.operations.worker.WorkType;
import com.jonatan.DDD.operations.worker.values.WorkerID;
import com.jonatan.DDD.operations.worker.values.WorkerName;
import com.jonatan.DDD.operations.worker.values.WorkerPhone;

import java.util.Set;

public class WorkerCreated extends DomainEvent {

    private final WorkerID workerID;
    private final WorkerName workerName;
    private final WorkerPhone workerPhone;
    private final Set<WorkType> workTypes;
    private final Set<Information> informations;


    public WorkerCreated(WorkerID workerID, WorkerName workerName, WorkerPhone workerPhone
    ,Set<WorkType> workTypes,Set<Information> informations) {
        super("operations.service.WorkerCreated");
        this.workerID = workerID;
        this.workerName = workerName;
        this.workerPhone = workerPhone;
        this.workTypes = workTypes;
        this.informations = informations;
    }

    public WorkerID getWorkerID() {
        return workerID;
    }

    public WorkerName getWorkerName() {
        return workerName;
    }

    public WorkerPhone getWorkerPhone() {
        return workerPhone;
    }

    public Set<WorkType> getWorkTypes() {
        return workTypes;
    }

    public Set<Information> getInformations() {
        return informations;
    }
}
