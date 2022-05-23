package com.jonatan.DDD.operations.service.values;

import co.com.sofka.domain.generic.Identity;

public class WarrantyId extends Identity {
    public WarrantyId() {
    }

    private WarrantyId(String id) {
        super(id);
    }

    public static WarrantyId of(String id) {
        return new WarrantyId(id);
    }
}

