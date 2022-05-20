package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.client.values.StateName;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;

public class ServiceRequestAdded extends DomainEvent {
    private final ServiceRequestID serviceRequestID;
    private final TypeOfRequest typeOfRequest;
    private final StateName stateName;
    private final Description description;

    public ServiceRequestAdded(ServiceRequestID serviceRequestID, TypeOfRequest typeOfRequest, StateName stateName, Description description) {
        super("operations.client.servicerequestadded");
        this.serviceRequestID=serviceRequestID;
        this.typeOfRequest=typeOfRequest;
        this.stateName=stateName;
        this.description=description;
    }

    public TypeOfRequest typeOfRequest(){
        return typeOfRequest;
    }

    public StateName stateName(){
        return stateName;
    }

    public Description description(){
        return description;
    }

    public ServiceRequestID serviceRequestID(){
        return serviceRequestID;
    }
}
