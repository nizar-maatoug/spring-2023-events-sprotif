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
@Table(name="equipe")
public class Equipe extends  AbstractEntity{

    private String nom;

    private String sport;

    private String logoURL;

}
