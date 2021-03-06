package com.jonatan.DDD.operations.worker.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.worker.values.WorkerID;
import com.jonatan.DDD.operations.worker.values.WorkerName;

public class Addname extends Command {

    private final WorkerID workerID;
    private final WorkerName workerName;

    public Addname(WorkerID workerID, WorkerName workerName) {
        this.workerID = workerID;
        this.workerName = workerName;
    }

    public WorkerID getWorkerID() {
        return workerID;
    }

    public WorkerName getWorkerName() {
        return workerName;
    }
}
