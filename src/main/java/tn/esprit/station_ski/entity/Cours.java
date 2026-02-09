package tn.esprit.station_ski.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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

}
