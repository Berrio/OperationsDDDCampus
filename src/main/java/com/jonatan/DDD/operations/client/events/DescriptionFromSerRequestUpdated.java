package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;

public class DescriptionFromSerRequestUpdated extends DomainEvent {

    private final ServiceRequestID serviceRequestID;
    private final Description description;

    public DescriptionFromSerRequestUpdated(ServiceRequestID serviceRequestID, Description description) {
        super("operations.client.descriptionfromserrequestupdated");
        this.serviceRequestID=serviceRequestID;
        this.description=description;
    }

    public ServiceRequestID getServiceRequestID() {
        return serviceRequestID;
    }

    public Description getDescription() {
        return description;
    }
}
