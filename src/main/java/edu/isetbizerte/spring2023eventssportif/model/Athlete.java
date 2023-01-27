package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name="athletes")
public class Athlete implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    @Column(name="creationDate", nullable = false, updatable = false)
    private Instant creationDate;

    @Column(name="lastModifiedDate")
    private Instant lastModifiedDate;

    private String nom;

    private String prenom;

    private Date dateNaissance;

    private String photoURL;

    private Integer ranking;

    public Athlete() {
    }

    public Athlete(Long id, Instant creationDate, Instant lastModifiedDate, String nom, String prenom, Date dateNaissance, String photoURL, Integer ranking) {
        this.id = id;
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.photoURL = photoURL;
        this.ranking = ranking;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Instant creationDate) {
        this.creationDate = creationDate;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }
}
