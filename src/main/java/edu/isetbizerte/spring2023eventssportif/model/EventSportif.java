package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="eventsportifs")
public class EventSportif extends AbstractEntity {

    private String nom;

    private Date dateDebut;

    private String logoURL;

    private String posterURL;

    @Embedded
    private Adresse lieu;

    @OneToMany(mappedBy = "eventSportif")
    private List<Categorie> categories;

    @OneToMany(mappedBy = "eventSportif")
    private List<Equipe> equipes;

}
