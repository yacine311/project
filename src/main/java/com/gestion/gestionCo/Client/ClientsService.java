package com.gestion.gestionCo.Client;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientsService {

    public List<Clients> getClients(){
        return Arrays.asList(
                new Clients(
                        1L,
                        "Mohamed",
                        "HOUBI",
                        "my.houbi@gmail.com",
                        "07 Residence la baudiniere"
                )
        );

    }
}
