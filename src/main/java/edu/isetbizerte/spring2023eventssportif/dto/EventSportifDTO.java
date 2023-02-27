package edu.isetbizerte.spring2023eventssportif.dto;


import edu.isetbizerte.spring2023eventssportif.model.EventSportif;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class EventSportifDTO {

    private Long id;

    private String nom;

    private Date dateDebut;

    private Date dateFin;

    private String logoURL;

    private String posterURL;

    private List<CategorieDTO> categories;


    private List<EquipeDTO> equipes;

    public static EventSportifDTO fromEntity(EventSportif eventSportif){
        if(eventSportif==null){
            return null;
        }
        return EventSportifDTO.builder()
                .id(eventSportif.getId())
                .nom(eventSportif.getNom())
                .posterURL(eventSportif.getPosterURL())
                .logoURL(eventSportif.getLogoURL())
                .dateDebut(eventSportif.getDateDebut())
                .dateFin(eventSportif.getDateFin())
                .build();
    }

    public static EventSportif toEntity(EventSportifDTO eventSportifDTO){
        if(eventSportifDTO==null){
            return null;
        }
        EventSportif eventSportif=new EventSportif();
        eventSportif.setId(eventSportifDTO.getId());
        eventSportif.setNom(eventSportifDTO.getNom());
        eventSportif.setDateDebut(eventSportifDTO.getDateDebut());
        eventSportif.setDateFin(eventSportifDTO.getDateFin());
        eventSportif.setLogoURL(eventSportif.getLogoURL());
        eventSportif.setPosterURL(eventSportifDTO.getPosterURL());

        return eventSportif;
    }


}
