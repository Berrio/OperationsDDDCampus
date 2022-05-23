package com.jonatan.DDD.operations.service.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.service.values.StateId;
import com.jonatan.DDD.operations.service.values.StateName;

public class NameOfStateUpdated extends DomainEvent {


    private final StateId stateId;
    private final StateName stateName;

    public NameOfStateUpdated( StateId stateId, StateName stateName) {
        super("operations.service.NameOfStateUpdated");

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
