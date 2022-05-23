package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.ClientID;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.StateName;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;
import com.jonatan.DDD.operations.service.values.ServiceID;

public class ServiceRequestUpdated extends DomainEvent  {

    private final ServiceID serviceID;
    private final TypeOfRequest typeOfRequest;
    private final Description description;
    private final StateName stateName;

    public ServiceRequestUpdated(ServiceID serviceID, TypeOfRequest typeOfRequest, Description description, StateName stateName) {
        super("operations.client.ServiceRequestUpdated");
        this.serviceID = serviceID;
        this.typeOfRequest = typeOfRequest;
        this.description = description;
        this.stateName = stateName;
    }

    public ServiceID getServiceID() {
        return serviceID;
    }

    public TypeOfRequest getTypeOfRequest() {
        return typeOfRequest;
    }

    public Description getDescription() {
        return description;
    }

    public StateName getStateName() {
        return stateName;
    }
}
