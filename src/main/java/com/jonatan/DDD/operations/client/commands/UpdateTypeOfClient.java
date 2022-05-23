package com.jonatan.DDD.operations.client.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.client.values.ClientID;
import com.jonatan.DDD.operations.client.values.TypeOfClient;

public class UpdateTypeOfClient extends Command {

    private final ClientID clientID;
    private final TypeOfClient typeOfClient;

    public UpdateTypeOfClient(ClientID clientID, TypeOfClient typeOfClient) {
        this.clientID = clientID;
        this.typeOfClient = typeOfClient;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public TypeOfClient getTypeOfClient() {
        return typeOfClient;
    }
}
