package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Entity
@Table(name="eventsportifs")
public class EventSportif implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    @Column(name="creationDate",nullable = false, updatable = false)
    private Instant creationDate;

    @LastModifiedDate
    @Column(name="lastModifiedDate")
    private Instant lastModifiedDate;

    private String nom;

    private Date dateDebut;

    private String logoURL;

    private String posterURL;

    public EventSportif() {
    }

    public EventSportif(Instant creationDate, Instant lastModifiedDate, String nom, Date dateDebut, String logoURL, String posterURL) {
        this.creationDate = creationDate;
        this.lastModifiedDate = lastModifiedDate;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.logoURL = logoURL;
        this.posterURL = posterURL;
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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public String getPosterURL() {
        return posterURL;
    }

    public void setPosterURL(String posterURL) {
        this.posterURL = posterURL;
    }
}
