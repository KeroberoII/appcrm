package com.example.appcrm.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Autowired
    public List<Client> getClient() {
        return  clientRepository.findAll();
    }

    public void addNewClient(Client client) {
        System.out.println(client);
    }
}
