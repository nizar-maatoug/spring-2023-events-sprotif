package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="categorie")
public class Categorie extends AbstractEntity{

    private String nom;

    private String sexe;

    private String poids;

    private Integer nbreStades;

    private Integer nbreAthletes;



}