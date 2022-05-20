package com.jonatan.DDD.operations.client.values;

import co.com.sofka.domain.generic.Identity;

public class ServiceRequestID extends Identity {

    public ServiceRequestID() {
    }

    private ServiceRequestID(String id) {
        super(id);
    }

    public static ServiceRequestID of(String id) {
        return new ServiceRequestID(id);
    }

}
