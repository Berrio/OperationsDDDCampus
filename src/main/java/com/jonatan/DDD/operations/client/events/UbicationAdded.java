package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.Address;
import com.jonatan.DDD.operations.client.values.UbicationID;

public class UbicationAdded extends DomainEvent {
    private final UbicationID ubicationID;
    private final Address address;

    public UbicationAdded(UbicationID ubicationID, Address address) {
        super("operations.client.ubicationadded");
        this.ubicationID=ubicationID;
        this.address=address;
    }

    public UbicationID getUbicationID() {
        return ubicationID;
    }

    public Address getAddress() {
        return address;
    }
}
