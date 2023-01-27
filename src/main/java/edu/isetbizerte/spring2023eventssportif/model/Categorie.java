package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="categories")
public class Categorie extends AbstractEntity{

    private String nom;

    private String sexe;

    private String poids;

    private Integer nbreStades;

    private Integer nbreAthletes;

    @ManyToOne
    @JoinColumn(name="idEvent")
    private EventSportif eventSportif;

    @OneToMany(mappedBy = "categorie")
    private List<Athlete> athletes;

}