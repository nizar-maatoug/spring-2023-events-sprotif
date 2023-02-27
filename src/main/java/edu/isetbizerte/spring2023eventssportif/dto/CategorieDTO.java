package edu.isetbizerte.spring2023eventssportif.dto;

import edu.isetbizerte.spring2023eventssportif.model.Athlete;
import edu.isetbizerte.spring2023eventssportif.model.Categorie;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder
public class CategorieDTO {

    private Long id;
    private String nom;

    private String genre;

    private String poids;



    private EventSportifDTO eventSportif;

    private List<AthleteDTO> athletes;

    public static CategorieDTO fromEntity(Categorie categorie){
        if(categorie==null){
            return null;
        }
        return CategorieDTO.builder()
                .id(categorie.getId())
                .nom(categorie.getNom())
                .genre(categorie.getGenre())
                .build();
    }

    public static Categorie toEntity(CategorieDTO categorieDTO){

        if(categorieDTO==null){
            return null;
        }
        Categorie categorie=new Categorie();
        categorie.setId(categorieDTO.getId());
        categorie.setNom(categorieDTO.getNom());
        categorie.setGenre(categorieDTO.getGenre());
        categorie.setPoids(categorieDTO.getPoids());

        return categorie;

    }
}
