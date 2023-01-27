package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "combat")
public class Combat extends AbstractEntity{
    private Integer numeroOrdre;
    private Integer idEvent;
    private Integer stade;
    private CombatState state;

    @ManyToOne
    @JoinColumn(name="idCategorie")
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name="idAthleteRouge")
    private Athlete athleteRouge;
    @ManyToOne
    @JoinColumn(name="idAthleteBleu")
    private Athlete athleteBleu;

    @OneToOne
    @JoinColumn(name="idScore")
    private Scoring score;

    @OneToOne
    @JoinColumn(name="idCombatRouge")
    private Combat combatRouge;

    @OneToOne
    @JoinColumn(name="idCombatBleu")
    private Combat combatBleu;



}
