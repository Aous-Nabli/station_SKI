package tn.esprit.station_ski.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCours ;
    int niveau ;
    TypeCours typeCours ;
    Support support ;
    Float prix ;
    int crenneau ;
    @OneToMany
    private List<Inscription> inscription;
    @ManyToOne
    private Moniteur moniteur;

}
