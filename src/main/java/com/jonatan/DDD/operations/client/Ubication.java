package com.jonatan.DDD.operations.client;

import co.com.sofka.domain.generic.Entity;
import com.jonatan.DDD.operations.client.values.Address;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;
import com.jonatan.DDD.operations.client.values.UbicationID;

import java.util.Objects;

public class Ubication extends Entity<UbicationID>  {

    public Address address;

    public Ubication(UbicationID entityId,Address address) {
        super(entityId);
        this.address=address;
    }

    public Address Address() {
        return address;
    }

    public void UpdateAddres(Address address){
        this.address= Objects.requireNonNull(address);
    }
}
