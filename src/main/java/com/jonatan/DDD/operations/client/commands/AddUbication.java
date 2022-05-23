package com.jonatan.DDD.operations.client.commands;

import co.com.sofka.domain.generic.Command;
import com.jonatan.DDD.operations.client.values.Address;
import com.jonatan.DDD.operations.client.values.ClientID;
import com.jonatan.DDD.operations.client.values.TypeOfRequest;
import com.jonatan.DDD.operations.client.values.UbicationID;
import com.jonatan.DDD.operations.service.values.ServiceID;

public class AddUbication extends Command {

    private final ClientID clientID;
    private final UbicationID ubicationID;
    private final Address address;

    public AddUbication(ClientID clientID, UbicationID ubicationID, Address address) {
        this.clientID = clientID;
        this.ubicationID = ubicationID;
        this.address = address;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public UbicationID getUbicationID() {
        return ubicationID;
    }

    public Address getAddress() {
        return address;
    }
}
