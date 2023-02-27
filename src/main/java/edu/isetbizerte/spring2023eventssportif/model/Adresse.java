package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
@Builder
public class Adresse implements Serializable {
    private String adresse;
    private String ville;
    private String codePostale;
    private String pays;
}