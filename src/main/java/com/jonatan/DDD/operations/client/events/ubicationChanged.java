package com.jonatan.DDD.operations.client.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.client.values.Address;
import com.jonatan.DDD.operations.client.values.UbicationID;

public class ubicationChanged extends DomainEvent {
    private final UbicationID ubicationID;
    private final Address address;

    public ubicationChanged(UbicationID ubicationID, Address address) {
        super("operations.client.ubicationChanged");
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

