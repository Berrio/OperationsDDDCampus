package com.jonatan.DDD.operations.service;

import co.com.sofka.domain.generic.Entity;
import com.jonatan.DDD.operations.service.values.WarrantyId;
import com.jonatan.DDD.operations.worker.values.WorkTypeID;

public class Warranty extends Entity<WarrantyId> {

    public Warranty(WarrantyId entityId) {
        super(entityId);
    }
}
