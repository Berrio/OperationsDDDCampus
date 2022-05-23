package com.jonatan.DDD.operations.service.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.service.values.StateId;
import com.jonatan.DDD.operations.service.values.StateName;

public class StateOfServiceAdded extends DomainEvent {

    private final StateId stateId;
    private final StateName stateName;

    public StateOfServiceAdded(StateId stateId, StateName stateName) {
        super("operations.service.StateOfServiceAdded");
        this.stateId = stateId;
        this.stateName = stateName;
    }

    public StateId getStateId() {
        return stateId;
    }

    public StateName getStateName() {
        return stateName;
    }
}
