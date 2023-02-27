package edu.isetbizerte.spring2023eventssportif.dto;

import edu.isetbizerte.spring2023eventssportif.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDTO {
    private String adresse;
    private String ville;
    private String codePostale;
    private String pays;

    public static AdresseDTO fromEntity(Adresse adresse){
        if(adresse==null){
            return null;
        }

        return AdresseDTO.builder()
                .adresse(adresse.getAdresse())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .build();
    }

    public static Adresse toEntity(AdresseDTO adresseDTO){
        if(adresseDTO==null){
            return null;
        }

        return Adresse.builder()
                .adresse(adresseDTO.getAdresse())
                .ville(adresseDTO.getVille())
                .codePostale(adresseDTO.getCodePostale())
                .pays(adresseDTO.getPays())
                .build();
    }
}
