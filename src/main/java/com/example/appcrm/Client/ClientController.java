package com.example.appcrm.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {

        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClient() {

        return clientService.getClient();
    }

    @PostMapping("/client")
    public void registerNewClient(@RequestBody Client client) {

        clientService.addNewClient(client);
    }

}
