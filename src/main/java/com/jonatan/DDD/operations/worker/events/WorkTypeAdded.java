package com.jonatan.DDD.operations.worker.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.worker.values.WorkTypeID;
import com.jonatan.DDD.operations.worker.values.WorkTypeName;

public class WorkTypeAdded extends DomainEvent {

    private final WorkTypeID workTypeID;
    private final WorkTypeName workTypeName;

    public WorkTypeAdded(WorkTypeID workTypeID, WorkTypeName workTypeName) {
        super("operations.service.WorkTypeAdded");
        this.workTypeID = workTypeID;
        this.workTypeName = workTypeName;
    }

    public WorkTypeID getWorkTypeID() {
        return workTypeID;
    }

    public WorkTypeName getWorkTypeName() {
        return workTypeName;
    }
}
