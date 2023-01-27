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
@Table(name="scoring")
public class Scoring extends AbstractEntity{
    private Integer scoreRouge;
    private Integer scoreBleu;

    private Integer penaliteRouge;
    private Integer penaliteBleu;

    private Athlete gagnant;
}