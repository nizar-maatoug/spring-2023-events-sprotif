package edu.isetbizerte.spring2023eventssportif.dto;

import edu.isetbizerte.spring2023eventssportif.model.Adresse;
import edu.isetbizerte.spring2023eventssportif.model.Athlete;
import edu.isetbizerte.spring2023eventssportif.model.Equipe;
import edu.isetbizerte.spring2023eventssportif.model.EventSportif;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EquipeDTO {

    private Long id;

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

    public static EquipeDTO fromEntity(Equipe equipe){
        if(equipe==null){
            return null;
        }
        return EquipeDTO.builder()
                .id(equipe.getId())
                .nom(equipe.getNom())
                .sport(equipe.getSport())
                .logoURL(equipe.getLogoURL())
                .lieu(equipe.getLieu())
                .build();
    }

    public static Equipe toEntity(EquipeDTO equipeDTO){
        if(equipeDTO==null){
            return null;
        }
        Equipe equipe= new Equipe();
        equipe.setId(equipeDTO.getId());
        equipe.setNom(equipeDTO.getNom());
        equipe.setSport(equipeDTO.getSport());
        equipe.setLogoURL(equipe.getLogoURL());
        equipe.setLieu(equipeDTO.getLieu());

        return equipe;
    }
}
