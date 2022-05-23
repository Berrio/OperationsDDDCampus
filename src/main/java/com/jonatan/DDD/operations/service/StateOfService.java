package com.jonatan.DDD.operations.service;

import co.com.sofka.domain.generic.Entity;
import com.jonatan.DDD.operations.service.values.StateId;
import com.jonatan.DDD.operations.service.values.StateName;
import com.jonatan.DDD.operations.worker.values.WorkTypeID;

import java.util.Objects;

public class StateOfService extends Entity<StateId> {

    protected  StateName stateName;

    public StateOfService(StateId entityId, StateName stateName) {
        super(entityId);
        this.stateName = stateName;
    }

    public StateName getStateName() {
        return stateName;
    }

    public void updateState(StateName stateName) {
        this.stateName = Objects.requireNonNull(stateName);
    }
}
