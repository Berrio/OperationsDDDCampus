package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.ClientID;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.service.values.ServiceID;

public class ServiceRequestDeleted extends DomainEvent {

    private final ClientID clientID;
    private final ServiceID serviceID;

    public ServiceRequestDeleted(ClientID clientID, ServiceID serviceID) {
        super("operations.client.ServiceRequestDeleted");
        this.clientID=clientID;
        this.serviceID=serviceID;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public ServiceID getServiceID() {
        return serviceID;
    }
}
