package tn.esprit.station_ski.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Sikeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numSikeur;
    String nomS;
    String prenomS;
    LocalDate dateNaisssance;
    String ville ;

    @OneToOne
    private Abonnement abonnement;
    @ManyToMany
    private List<Piste> piste ;
    @OneToMany(mappedBy = "sikeur")
    private List<Inscription> inscriptionss;

}
