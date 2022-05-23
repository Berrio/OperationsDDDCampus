package com.jonatan.DDD.operations.service.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.service.values.DateOfService;
import com.jonatan.DDD.operations.service.values.ServiceID;

public class ChangeDateOfService extends Command {

    private final ServiceID serviceID;
    private final DateOfService dateOfService;

    public ChangeDateOfService(ServiceID serviceID, DateOfService dateOfService) {
        this.serviceID = serviceID;
        this.dateOfService = dateOfService;
    }

    public ServiceID getServiceID() {
        return serviceID;
    }

    public DateOfService getDateOfService() {
        return dateOfService;
    }
}
