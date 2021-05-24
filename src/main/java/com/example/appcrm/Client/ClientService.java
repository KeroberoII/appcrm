package com.example.appcrm.Client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    public List<Client> getClient() {
        return List.of(
                new Client(1L,"Dupont", "Marie", "dupontmarie@gmail.com")
        );
    }
}
