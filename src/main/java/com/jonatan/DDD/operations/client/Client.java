package com.jonatan.DDD.operations.client;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.events.*;
import com.jonatan.DDD.operations.client.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Client extends AggregateEvent<ClientID> {

    protected ClientName clientName;
    protected TypeOfClient typeOfClient;
    protected TypeID typeID;
    protected Set<Ubication> ubications;
    protected Set<ServiceRequest>serviceRequests;

    public Client(ClientID clientID, ClientName clientName, TypeOfClient typeOfClient, TypeID typeID,Set<Ubication> ubications,Set<ServiceRequest>serviceRequests){
        super(clientID);
        appendChange(new ClientCreated(clientName,typeOfClient,typeID,ubications,serviceRequests)).apply();
    }

    private Client(ClientID clientID){
        super(clientID);
        subscribe(new ClientChange(this));
    }

    public void addServiceRequest(ServiceRequestID entityId, TypeOfRequest typeOfRequest, StateName stateName, Description description){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(typeOfRequest);
        Objects.requireNonNull(stateName);
        Objects.requireNonNull(description);
        appendChange(new ServiceRequestAdded(entityId,typeOfRequest,stateName,description)).apply();
    }

    public static Client from(ClientID clientID, List<DomainEvent> events) {
        var client = new Client(clientID);
        events.forEach(client::applyEvent);
        return client;
    }

    public void addUbication(UbicationID entityId,Address address){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(address);
        appendChange(new UbicationAdded(entityId,address)).apply();
    }

    public void UpdateServiceRequest(ServiceRequestID entityId,StateName stateName,Description description){
        appendChange(new StateNameUpdated(entityId,stateName)).apply();
    }

    public void UpdateStateNameFromSerRequest(ServiceRequestID entityId,StateName stateName){
        appendChange(new StateNameUpdated(entityId,stateName)).apply();
    }

    public void UpdateTypeOfRequestFromSerRequest(ServiceRequestID entityId,TypeOfRequest typeOfRequest){
        appendChange(new TypeOfRequestUpdated(entityId,typeOfRequest)).apply();
    }

    public  Optional<ServiceRequest> getServiceRequestById(ServiceRequestID serviceRequestID){
        return serviceRequests().stream().filter(serviceRequest -> serviceRequest.identity().equals(serviceRequestID))
                .findFirst();
    }
    public Optional<Ubication> getUbicationById(UbicationID ubicationID){
        return ubications().stream().filter(ubication -> ubication.identity().equals(ubicationID))
                .findFirst();
    }

    public ClientName clientName() {
        return clientName;
    }

    public TypeOfClient typeOfClient() {
        return typeOfClient;
    }

    public TypeID typeID() {
        return typeID;
    }

    public Set<Ubication> ubications() {
        return ubications;
    }

    public Set<ServiceRequest> serviceRequests() {
        return serviceRequests;
    }
}
