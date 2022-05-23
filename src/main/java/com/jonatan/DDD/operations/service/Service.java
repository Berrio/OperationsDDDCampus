package com.jonatan.DDD.operations.service;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.service.values.ClientID;
import com.jonatan.DDD.operations.service.values.DateOfService;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.service.values.StateId;
import com.jonatan.DDD.operations.worker.WorkType;
import com.jonatan.DDD.operations.worker.Worker;
import com.jonatan.DDD.operations.worker.events.WorkTypeAdded;
import com.jonatan.DDD.operations.worker.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Service extends AggregateEvent<ServiceID> {

    protected ServiceID serviceID;
    protected DateOfService dateOfService;
    protected ClientID clientID;
    protected Set<StateOfService> stateOfServices;
    protected Set<Warranty> warranties;
    protected WorkerID worker;

    public Service( ServiceID serviceID, DateOfService dateOfService, ClientID clientID,WorkerID worker) {
        super(serviceID);
        this.serviceID = serviceID;
        this.dateOfService = dateOfService;
        this.clientID = clientID;
        this.worker=worker;

    }

    public static Service from(ServiceID serviceID, DateOfService dateOfService, ClientID clientID,WorkerID worker, List<DomainEvent> events) {
        var Ser = new Service(serviceID,dateOfService,clientID,worker);
        events.forEach(Ser::applyEvent);
        return Ser;
    }

    protected Optional<StateOfService> getStateofServicesById(StateId entityId) {
        return getStateOfServices()
                .stream()
                .filter(workType -> workType.identity().equals(entityId))
                .findFirst();
    }

    public void addWorker(WorkerID worker ){
        this.worker=worker;
    }

    private Service(ServiceID serviceID) {
        super(serviceID);
        subscribe(new ServiceChange(this));
    }


    public ServiceID getServiceID() {
        return serviceID;
    }

    public DateOfService getDateOfService() {
        return dateOfService;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Set<StateOfService> getStateOfServices() {
        return stateOfServices;
    }

    public Set<Warranty> getWarranties() {
        return warranties;
    }

    public WorkerID getWorker() {
        return worker;
    }
}
