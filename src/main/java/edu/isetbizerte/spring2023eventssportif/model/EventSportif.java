package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="eventsportifs")
public class EventSportif extends AbstractEntity {

    private String nom;

    private Date dateDebut;

    private String logoURL;

    private String posterURL;

}
