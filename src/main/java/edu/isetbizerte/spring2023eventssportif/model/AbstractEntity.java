package edu.isetbizerte.spring2023eventssportif.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.Instant;

@Data
@MappedSuperclass
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @CreatedDate
    @Column(name="creationDate",nullable = false, updatable = false)
    private Instant creationDate;

    @LastModifiedDate
    @Column(name="lastModifiedDate")
    private Instant lastModifiedDate;
}
