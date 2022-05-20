package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.client.values.StateName;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;

public class TypeOfRequestFromSerRequestUpdated extends DomainEvent {

    public TypeOfRequestFromSerRequestUpdated(ServiceRequestID entityId, TypeOfRequest typeOfRequest) {
        super("operations.client.typeofrequestfromserrequestupdated");
    }
}
