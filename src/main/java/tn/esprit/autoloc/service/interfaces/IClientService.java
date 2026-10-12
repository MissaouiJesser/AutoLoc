package tn.esprit.autoloc.service.interfaces;

import tn.esprit.autoloc.domain.Client;

import java.util.Set;

public interface IClientService {

    Set<Client> retrieveAllClients();

    Client retrieveClient(Long clientId);

    Client addClient(Client client);

    void removeClient(Long clientId);

    Client modifyClient(Client client);
}
