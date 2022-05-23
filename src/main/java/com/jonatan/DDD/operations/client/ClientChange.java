package com.jonatan.DDD.operations.client;

import co.com.sofka.domain.generic.EventChange;
import com.jonatan.DDD.operations.client.commands.AddServiceRequest;
import com.jonatan.DDD.operations.client.events.*;
import com.jonatan.DDD.operations.client.values.TypeID;
import com.jonatan.DDD.operations.client.values.TypeOfClient;
import com.jonatan.DDD.operations.worker.events.WorkTypeAdded;

import java.util.Set;

public class ClientChange extends EventChange {
    public ClientChange(Client client) {

        apply((ClientCreated event) -> {
            client.clientName = event.getClientName();
            client.typeOfClient = event.getTypeOfClient();
            client.typeID = event.getTypeID();
            client.ubications = event.getUbications();
            client.serviceRequests = event.getServiceRequests();
        });

        apply((ServiceRequestAdded event) -> {
            client.serviceRequests.add(new ServiceRequest(
                    event.serviceRequestID(),
                    event.typeOfRequest(),
                    event.stateName(),
                    event.description()
            ));
        });

        apply((UbicationAdded event) -> {
            client.ubications.add(new Ubication(
                    event.getUbicationID(),
                    event.getAddress()
            ));
        });

        apply((ubicationChanged event) -> {
            var ubication = client.getUbicationById(event.getUbicationID()).
                    orElseThrow(() -> new IllegalArgumentException("ubication not found"));
            ubication.UpdateAddres(event.getAddress());
        });

        apply((TypeOfClientUpdated event) -> {
            client.typeOfClient=event.getTypeOfClient();
        });

        apply((ServiceRequestUpdated event) -> {
            var service = client.getServiceRequestById(event.getServiceID()).
                    orElseThrow(() -> new IllegalArgumentException("service not found"));
            client.UpdateServiceRequest(event.getServiceID(),event.getStateName(),event.getDescription());
        });

    }
}

