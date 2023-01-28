package edu.isetbizerte.spring2023eventssportif.repositories;

import edu.isetbizerte.spring2023eventssportif.model.Categorie;
import edu.isetbizerte.spring2023eventssportif.model.Combat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CombatRepository extends JpaRepository<Combat,Long> {

    List<Combat> findCombatsByCategorie(Categorie categorie);
}
