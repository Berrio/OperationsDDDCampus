package com.jonatan.DDD.operations.worker.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.worker.values.WorkTypeID;
import com.jonatan.DDD.operations.worker.values.WorkTypeName;
import com.jonatan.DDD.operations.worker.values.WorkerID;

public class DeleteWorkType extends Command {

    private final WorkerID workerID;
    private final WorkTypeID workTypeID;
    private final WorkTypeName workTypeName;

    public DeleteWorkType(WorkerID workerID, WorkTypeID workTypeID, WorkTypeName workTypeName){
        this.workerID = workerID;
        this.workTypeID = workTypeID;
        this.workTypeName = workTypeName;
    }

    public WorkerID getWorkerID() {
        return workerID;
    }

    public WorkTypeID getWorkTypeID() {
        return workTypeID;
    }

    public WorkTypeName getWorkTypeName() {
        return workTypeName;
    }
}
