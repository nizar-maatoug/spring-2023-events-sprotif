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
@Table(name="equipe")
public class Equipe extends  AbstractEntity{

    private String nom;
    private String sport;
    private String logoURL;
    @Embedded
    private Adresse lieu;
    @ManyToOne
    @JoinColumn(name="idEvent")
    private EventSportif eventSportif;

    @OneToMany(mappedBy = "equipe")
    private List<Athlete> athletes;

}
