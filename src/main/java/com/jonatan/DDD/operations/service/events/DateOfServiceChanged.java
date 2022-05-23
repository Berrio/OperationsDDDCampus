package com.jonatan.DDD.operations.service.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.jonatan.DDD.operations.service.values.DateOfService;

public class DateOfServiceChanged extends DomainEvent {

    private final DateOfService dateOfService;

    public DateOfServiceChanged(DateOfService dateOfService) {
        super("operations.service.DateOfServiceChanged");
        this.dateOfService = dateOfService;
    }

    public DateOfService getDateOfService() {
        return dateOfService;
    }
}
