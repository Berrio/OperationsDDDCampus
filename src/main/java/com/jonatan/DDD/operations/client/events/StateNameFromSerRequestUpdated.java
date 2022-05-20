package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.client.values.StateName;

public class StateNameFromSerRequestUpdated extends DomainEvent {

    private final ServiceRequestID serviceRequestID;
    private final StateName stateName;

    public StateNameFromSerRequestUpdated(ServiceRequestID serviceRequestID, StateName stateName) {
        super("operations.client.statenamefromserrequestupdated");
        this.serviceRequestID=serviceRequestID;
        this.stateName=stateName;
    }

    public ServiceRequestID getServiceRequestID() {
        return serviceRequestID;
    }

    public StateName getStateName() {
        return stateName;
    }
}
