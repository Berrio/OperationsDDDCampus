package com.jonatan.DDD.operations.worker;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.worker.events.NameAdded;
import com.jonatan.DDD.operations.worker.events.WorkTypeAdded;
import com.jonatan.DDD.operations.worker.events.WorkTypeDeleted;
import com.jonatan.DDD.operations.worker.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Worker extends AggregateEvent<WorkerID> {

    protected WorkerID workerID;
    protected WorkerName workerName;
    protected WorkerPhone workerPhone;
    protected Set<WorkType> workTypes;
    protected Set<Information> informations;

    public Worker(WorkerID workerID, WorkerName workerName, WorkerPhone workerPhone) {
        super(workerID);
        this.workerID = workerID;
        this.workerName = workerName;
        this.workerPhone = workerPhone;
    }

    public static Worker from(WorkerID workerID, WorkerName workerName, WorkerPhone workerPhone, List<DomainEvent> events) {
        var worker = new Worker(workerID, workerName, workerPhone);
        events.forEach(worker::applyEvent);
        return worker;
    }

    private Worker(WorkerID workerID) {
        super(workerID);
        subscribe(new WorkerChange(this));
    }


    public void addWorkType(WorkerID workerID, WorkTypeID workTypeID, WorkTypeName workTypeName) {
        Objects.requireNonNull(workerID);
        Objects.requireNonNull(workTypeID);
        Objects.requireNonNull(workTypeName);
        appendChange(new WorkTypeAdded(workTypeID, workTypeName)).apply();
    }

    public void deleteWorkType(WorkerID workerID, WorkTypeID workTypeID, WorkTypeName workTypeName) {
        Objects.requireNonNull(workerID);
        Objects.requireNonNull(workTypeID);
        Objects.requireNonNull(workTypeName);
        appendChange(new WorkTypeDeleted(workTypeID, workTypeName)).apply();
    }

    public void AddName(WorkerName workerName) {
        Objects.requireNonNull(workerID);
        Objects.requireNonNull(workerName);
        appendChange(new NameAdded(workerName)).apply();
    }

    protected Optional<WorkType> getWorkTypeById(WorkTypeID entityId) {
        return getWorkTypes()
                .stream()
                .filter(workType -> workType.identity().equals(entityId))
                .findFirst();
    }

    protected Optional<Information> getInformationById(Information entityId) {
        return getInformations()
                .stream()
                .filter(info -> info.identity().equals(entityId))
                .findFirst();
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
