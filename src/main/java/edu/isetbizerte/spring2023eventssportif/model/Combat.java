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
@Table(name = "combat")
public class Combat extends AbstractEntity{

    private Integer numeroOrdre;

    private Integer idEvent;

    private Integer stade;

    private CombatState state;

}
