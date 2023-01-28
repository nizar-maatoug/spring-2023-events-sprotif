package edu.isetbizerte.spring2023eventssportif.repositories;

import edu.isetbizerte.spring2023eventssportif.model.Athlete;
import edu.isetbizerte.spring2023eventssportif.model.Categorie;
import edu.isetbizerte.spring2023eventssportif.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {
    List<Athlete> findAthletesByCategorie(Categorie categorie);

    List<Athlete> findAthletesByEquipe(Equipe equipe);

    List<Athlete> findAthletesByEquipeAndCategorie(Equipe equipe, Categorie categorie);

}
