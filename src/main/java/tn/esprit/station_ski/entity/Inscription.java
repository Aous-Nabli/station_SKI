package tn.esprit.station_ski.entity;

import jakarta.persistence.*;

@Entity
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numinscription;
    int numSemaine;

    @ManyToOne
    private Cours cours;
    @ManyToOne
    private Sikeur sikeur;
}
