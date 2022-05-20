package com.jonatan.DDD.operations.client;

import co.com.sofka.domain.generic.AggregateEvent;
import com.jonatan.DDD.operations.client.events.*;
import com.jonatan.DDD.operations.client.values.*;

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

    public void addUbication(UbicationID entityId,Address address){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(address);
        appendChange(new UbicationAdded(entityId,address)).apply();

    }

    public void UpdateDescriptionFromSerRequest(ServiceRequestID entityId,Description description){
        appendChange(new DescriptionFromSerRequestUpdated(entityId,description)).apply();
    }

    public void UpdateStateNameFromSerRequest(ServiceRequestID entityId,StateName stateName){
        appendChange(new StateNameFromSerRequestUpdated(entityId,stateName)).apply();
    }

    public void UpdateTypeOfRequestFromSerRequest(ServiceRequestID entityId,TypeOfRequest typeOfRequest){
        appendChange(new TypeOfRequestFromSerRequestUpdated(entityId,typeOfRequest)).apply();
    }

    public  Optional<ServiceRequest> getServiceRequest(ServiceRequestID serviceRequestID){
        return serviceRequests().stream().filter(serviceRequest -> serviceRequest.identity().equals(serviceRequestID))
                .findFirst();
    }
    public Optional<Ubication> getUbication(UbicationID ubicationID){
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
