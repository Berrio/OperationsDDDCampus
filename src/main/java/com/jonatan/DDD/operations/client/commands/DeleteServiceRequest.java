package com.jonatan.DDD.operations.client.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.client.values.ClientID;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.StateName;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;
import com.jonatan.DDD.operations.service.values.ServiceID;

public class DeleteServiceRequest extends Command {

    private final ClientID clientID;
    private final ServiceID serviceID;

    public DeleteServiceRequest(ClientID clientID, ServiceID serviceID) {
        this.clientID = clientID;
        this.serviceID = serviceID;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public ServiceID getServiceID() {
        return serviceID;
    }
}
