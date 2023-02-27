package edu.isetbizerte.spring2023eventssportif.dto;

import edu.isetbizerte.spring2023eventssportif.model.Athlete;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class AthleteDTO {

    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String photoURL;
    private Integer ranking;

    public static AthleteDTO fromEntity(Athlete athlete){
        if(athlete==null){
            return null;
        }
        return AthleteDTO.builder()
                .id(athlete.getId())
                .nom(athlete.getNom())
                .prenom(athlete.getPrenom())
                .dateNaissance(athlete.getDateNaissance())
                .photoURL(athlete.getPhotoURL())
                .ranking(athlete.getRanking())
                .build();
    }
    public static Athlete toEntity(AthleteDTO athleteDTO){
        if(athleteDTO==null){
            return null;
        }
        Athlete athlete=new Athlete();
        athlete.setId(athleteDTO.getId());
        athlete.setNom(athleteDTO.getNom());
        athlete.setPrenom(athleteDTO.getPrenom());
        athlete.setDateNaissance(athleteDTO.getDateNaissance());
        athlete.setPhotoURL(athlete.getPhotoURL());
        athlete.setRanking(athleteDTO.getRanking());

        return athlete;
    }
}
