package com.jonatan.DDD.operations.worker;

import co.com.sofka.domain.generic.EventChange;
import com.jonatan.DDD.operations.client.events.ClientCreated;
import com.jonatan.DDD.operations.worker.commands.Addname;
import com.jonatan.DDD.operations.worker.events.WorkTypeAdded;
import com.jonatan.DDD.operations.worker.events.WorkTypeDeleted;
import com.jonatan.DDD.operations.worker.events.WorkerCreated;

public class WorkerChange extends EventChange {

    public WorkerChange(Worker worker) {

        apply((WorkerCreated event)->{
            worker.workerName=event.getWorkerName();
            worker.workerPhone=event.getWorkerPhone();
            worker.informations=event.getInformations();
            worker.workTypes=event.getWorkTypes();
        });

        apply((WorkTypeAdded event)->{
            var type=worker.getWorkTypeById(event.getWorkTypeID()).
                    orElseThrow(()-> new IllegalArgumentException("Worker not found"));
            type.UpdateTypeName(event.getWorkTypeName());
        });

        apply((WorkTypeDeleted event)->{
            worker.workTypes.remove(event.getWorkTypeID());
        });


    }
}
