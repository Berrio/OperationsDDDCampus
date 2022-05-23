package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;

public class TypeOfRequestUpdated extends DomainEvent {

    public TypeOfRequestUpdated(ServiceRequestID entityId, TypeOfRequest typeOfRequest) {
        super("operations.client.typeofrequestfromserrequestupdated");
    }
}
