package com.gestion.gestionCo.domain;

import lombok.Data;

@Data
public class Fournisseur extends PersonnePhysique {

    private String type;
    private String registreCommerce;

    public Fournisseur(){

    }

}
