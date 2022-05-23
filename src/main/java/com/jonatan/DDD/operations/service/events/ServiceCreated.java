package com.jonatan.DDD.operations.service.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.service.StateOfService;
import com.jonatan.DDD.operations.service.Warranty;
import com.jonatan.DDD.operations.service.values.ClientID;
import com.jonatan.DDD.operations.service.values.DateOfService;
import com.jonatan.DDD.operations.service.values.ServiceID;

import java.util.Set;

public class ServiceCreated extends DomainEvent {

    private final ServiceID serviceID;
    private final DateOfService dateOfService;
    private final ClientID clientID;
    protected Set<StateOfService> stateOfServices;
    protected Set<Warranty> warranties;

    public ServiceCreated(ServiceID serviceID, DateOfService dateOfService, ClientID clientID,Set<StateOfService> stateOfServices,Set<Warranty> warranties) {
        super("operations.service.WorkerCreated");
        this.serviceID = serviceID;
        this.dateOfService = dateOfService;
        this.clientID = clientID;
        this.warranties=warranties;
        this.stateOfServices=stateOfServices;
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
}
