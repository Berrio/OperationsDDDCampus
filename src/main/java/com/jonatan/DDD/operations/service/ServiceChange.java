package com.jonatan.DDD.operations.service;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import com.jonatan.DDD.operations.service.events.DateOfServiceChanged;
import com.jonatan.DDD.operations.service.events.NameOfStateUpdated;
import com.jonatan.DDD.operations.service.events.ServiceCreated;
import com.jonatan.DDD.operations.service.events.WorkerAdded;
import com.jonatan.DDD.operations.worker.events.WorkTypeAdded;
import com.jonatan.DDD.operations.worker.events.WorkTypeDeleted;
import com.jonatan.DDD.operations.worker.events.WorkerCreated;

public class ServiceChange extends EventChange {

    public ServiceChange(Service  service) {

        apply((ServiceCreated event)->{
            service.dateOfService=event.getDateOfService();
            service.clientID=event.getClientID();
            service.warranties=event.getWarranties();
            service.stateOfServices=event.getStateOfServices();
        });

        apply((WorkerAdded event)->{
          service.addWorker(event.getWorkerID());

        });

        apply((DateOfServiceChanged event)->{
            service.dateOfService= event.getDateOfService();
        });

        apply((NameOfStateUpdated event)->{
            var state=service.getStateofServicesById(event.getStateId()).
                    orElseThrow(()-> new IllegalArgumentException("Product not found"));
            state.stateName=event.getStateName();
        });
    }
}
