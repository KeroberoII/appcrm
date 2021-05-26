package com.example.appcrm.Client;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.awt.*;
import java.util.List;

@Configuration
public class ClientConfig {


    @Bean
    CommandLineRunner commandLineRunner(ClientRepository repository) {
        return args -> {
            Client mariam = new Client("Dupont", "Mariam", "dupontm@gmail.com");
            Client bob = new Client("Clavier", "Bob","bobc@gmail.com");
            Client alex = new Client("Barcelo", "Alexandre","abarcelo@gmail.com");
            Client bangaly = new Client("Cisse", "Bangaly","cisseb@gmail.com");
            Client ahil = new Client("Hassani", "Ahil","hassania@gmail.com");

            repository.saveAll(
                    List.of(mariam, bob, ahil, alex, bangaly)
            );
        };
    }
}
