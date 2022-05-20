package com.jonatan.DDD.operations.client;

import co.com.sofka.domain.generic.EventChange;
import com.jonatan.DDD.operations.client.events.ClientCreated;
import com.jonatan.DDD.operations.client.values.TypeID;
import com.jonatan.DDD.operations.client.values.TypeOfClient;

import java.util.Set;

public class ClientChange extends EventChange {
    public ClientChange(Client client) {

        apply((ClientCreated event)->{
            client.clientName=event.getClientName();
            client.typeOfClient=event.getTypeOfClient();
            client.typeID=event.getTypeID();
            client.ubications=event.getUbications();
            client.serviceRequests=event.getServiceRequests();
        });

    }
}

//    protected TypeOfClient typeOfClient;
//    protected TypeID typeID;
//    protected Set<Ubication> ubications;
//    protected Set<ServiceRequest>serviceRequests;