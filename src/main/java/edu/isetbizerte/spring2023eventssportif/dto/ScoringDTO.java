package edu.isetbizerte.spring2023eventssportif.dto;

import edu.isetbizerte.spring2023eventssportif.model.Scoring;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ScoringDTO {

    private Long id;

    private Integer scoreRouge;
    private Integer scoreBleu;

    private Integer penaliteRouge;
    private Integer penaliteBleu;

    private AthleteDTO athleteGagnant;

    public static ScoringDTO fromEntity(Scoring scoring){
        if(scoring==null){
            return null;
        }
        return ScoringDTO.builder()
                .id(scoring.getId())
                .scoreRouge(scoring.getScoreRouge())
                .scoreBleu(scoring.getScoreBleu())
                .penaliteBleu(scoring.getPenaliteBleu())
                .penaliteRouge(scoring.getPenaliteRouge())
                .build();
    }
    public static Scoring toEntity(ScoringDTO scoringDTO){
        if(scoringDTO==null){
            return null;
        }

        Scoring scoring=new Scoring();
        scoring.setId(scoringDTO.getId());
        scoring.setScoreRouge(scoringDTO.getScoreRouge());
        scoring.setScoreBleu((scoringDTO.getScoreBleu()));
        scoring.setPenaliteRouge(scoring.getPenaliteRouge());
        scoring.setPenaliteBleu(scoring.getPenaliteBleu());
        return scoring;
    }


}
