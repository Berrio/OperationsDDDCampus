package com.jonatan.DDD.operations.worker;

import co.com.sofka.domain.generic.Entity;
import com.jonatan.DDD.operations.worker.values.WorkTypeID;
import com.jonatan.DDD.operations.worker.values.WorkerInformationId;

import java.util.Objects;

public class Information extends Entity<WorkerInformationId> {

    private Information information;

    public Information(WorkerInformationId entityId, Information information) {
        super(entityId);
        this.information = information;
    }

    public void UpdateInformation(Information information) {

        this.information = Objects.requireNonNull(information);
    }
}
