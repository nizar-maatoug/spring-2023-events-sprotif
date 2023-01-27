package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="athletes")
public class Athlete extends AbstractEntity {
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String photoURL;
    private Integer ranking;

    @ManyToOne
    @JoinColumn(name="idEquipe")
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie;

}
