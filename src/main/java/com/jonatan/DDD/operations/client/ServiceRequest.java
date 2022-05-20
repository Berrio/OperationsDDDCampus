package com.jonatan.DDD.operations.client;

import co.com.sofka.domain.generic.Entity;
import com.jonatan.DDD.operations.client.values.Description;
import com.jonatan.DDD.operations.client.values.ServiceRequestID;
import com.jonatan.DDD.operations.client.values.StateName;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;

import java.util.Objects;

public class ServiceRequest extends Entity<ServiceRequestID> {

    private  TypeOfRequest typeOfRequest;
    private  StateName stateName;
    private  Description description;

    public ServiceRequest(ServiceRequestID entityId, TypeOfRequest typeOfRequest, StateName stateName, Description description) {
        super(entityId);
        this.typeOfRequest=typeOfRequest;
        this.stateName=stateName;
        this.description=description;
    }

    public  TypeOfRequest typeOfRequest(){
        return typeOfRequest;
    }
    public  StateName stateName(){
        return stateName;
    }
    public  Description description(){
        return description;

    }

    public void UpdateTypeOfRequest(TypeOfRequest typeOfRequest){
        this.typeOfRequest= Objects.requireNonNull(typeOfRequest);
    }

    public void UpdateStateName(StateName stateName){
        this.stateName= Objects.requireNonNull(stateName);
    }

    public void UpdateDescription(Description description){
        this.description= Objects.requireNonNull(description);
    }

}
