package com.jonatan.DDD.operations.client.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.client.values.ClientID;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.StateName;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;
import com.jonatan.DDD.operations.service.values.ServiceID;

public class AddServiceRequest extends Command {

    private final ClientID clientID;
    private final ServiceID serviceID;
    private final TypeOfRequest typeOfRequest;
    private final Description description;
    private final StateName stateName;

    public AddServiceRequest(ClientID clientID, ServiceID serviceID, TypeOfRequest typeOfRequest, Description description, StateName stateName) {
        this.clientID = clientID;
        this.serviceID = serviceID;
        this.typeOfRequest = typeOfRequest;
        this.description = description;
        this.stateName = stateName;
    }

    public ClientID getClientID() {
        return clientID;
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
