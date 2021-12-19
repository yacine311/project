package com.gestion.gestionCo.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Produit {


    private String designation;

    private Long prixUnitaire;

    private Double quantity;
}
