package edu.isetbizerte.spring2023eventssportif.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Adresse implements Serializable {

    private String adresse;

    private String ville;

    private String codePostale;

    private String pays;
}