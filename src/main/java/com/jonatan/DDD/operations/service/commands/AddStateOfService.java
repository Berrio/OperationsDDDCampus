package com.jonatan.DDD.operations.service.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.service.values.ServiceID;
import com.jonatan.DDD.operations.service.values.StateId;
import com.jonatan.DDD.operations.service.values.StateName;

public class AddStateOfService extends Command {

    private final ServiceID serviceID;
    private final StateId stateId;
    private final StateName stateName;

    public AddStateOfService(ServiceID serviceID, StateId stateId, StateName stateName) {
        this.serviceID = serviceID;
        this.stateId = stateId;
        this.stateName = stateName;
    }

    public ServiceID getServiceID() {
        return serviceID;
    }

    public StateId getStateId() {
        return stateId;
    }

    public StateName getStateName() {
        return stateName;
    }
}
