package com.jonatan.DDD.operations.worker;

import co.com.sofka.domain.generic.Entity;
import com.jonatan.DDD.operations.worker.values.WorkTypeID;
import com.jonatan.DDD.operations.worker.values.WorkTypeName;

import java.util.Objects;

public class WorkType extends Entity<WorkTypeID> {

    private WorkTypeName workTypeName;

    public WorkType(WorkTypeID entityId, WorkTypeName workTypeName) {
        super(entityId);
        this.workTypeName = workTypeName;
    }

    public void UpdateTypeName(WorkTypeName workTypeName){

        this.workTypeName = Objects.requireNonNull(workTypeName);
    }

}
