package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.client.values.StateName;
import com.jonatan.DDD.operations.client.values.TypeOfClient;

public class TypeOfClientUpdated extends DomainEvent  {

    private final TypeOfClient typeOfClient;

    public TypeOfClientUpdated(TypeOfClient typeOfClient) {
        super("operations.client.TypeOfClientUpdated");
        this.typeOfClient=typeOfClient;
    }

    public TypeOfClient getTypeOfClient() {
        return typeOfClient;
    }
}
