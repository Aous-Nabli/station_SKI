package tn.esprit.station_ski.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Sikeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSikeur;
    String nomS;
    String prenomS;
    LocalDate dateNaisssance;
    String ville ;
}
