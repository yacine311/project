package com.gestion.gestionCo.service;

import com.gestion.gestionCo.domain.PersonnePhysique;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ClientsService {

    public List<PersonnePhysique> getClients(){
        return Arrays.asList(
                new PersonnePhysique(
                        1L,
                        "Mohamed",
                        "HOUBI",
                        "my.houbi@gmail.com",
                        "07 Residence la baudiniere"
                )
        );

    }
}
