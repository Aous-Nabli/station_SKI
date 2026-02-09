package tn.esprit.station_ski.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numAbon ;
    LocalDate dateDebut;
    LocalDate dateFin;
    float prixAbbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbon;
}
