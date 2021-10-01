package com.gestion.gestionCo.controller;

import com.gestion.gestionCo.domain.PersonneMoral;
import com.gestion.gestionCo.service.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/client")
public class ClientController {

    private final ClientsService clientService;

    @Autowired
    public ClientController(ClientsService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<PersonneMoral> getClients(){
       return clientService.getClients();

    }

}
