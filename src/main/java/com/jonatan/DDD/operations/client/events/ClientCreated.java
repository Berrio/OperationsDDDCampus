package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.ServiceRequest;
import com.jonatan.DDD.operations.client.Ubication;
import com.jonatan.DDD.operations.client.values.ClientName;
import com.jonatan.DDD.operations.client.values.TypeID;
import com.jonatan.DDD.operations.client.values.TypeOfClient;

import java.util.Set;

public class ClientCreated extends DomainEvent {
    private final ClientName clientName;
    private final TypeOfClient typeOfClient;
    private final TypeID typeID;
    private final Set<Ubication> ubications;
    private final Set<ServiceRequest>serviceRequests;

    public  ClientCreated(ClientName clientName,TypeOfClient typeOfClient,TypeID typeID,Set<Ubication> ubications,Set<ServiceRequest>serviceRequests){
        super("operations.client.clientcreated");
        this.clientName=clientName;
        this.typeOfClient=typeOfClient;
        this.typeID=typeID;
        this.ubications=ubications;
        this.serviceRequests=serviceRequests;
    }

    public ClientName getClientName() {
        return clientName;
    }

    public TypeOfClient getTypeOfClient() {
        return typeOfClient;
    }

    public TypeID getTypeID() {
        return typeID;
    }

    public Set<Ubication> getUbications() {
        return ubications;
    }

    public Set<ServiceRequest> getServiceRequests() {
        return serviceRequests;
    }
}


