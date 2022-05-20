package com.jonatan.DDD.operations.client.values;

import co.com.sofka.domain.generic.Identity;

public class UbicationID extends Identity {
    public UbicationID() {
    }

    private UbicationID(String id) {
        super(id);
    }

    public static UbicationID of(String id) {
        return new UbicationID(id);
    }
}
