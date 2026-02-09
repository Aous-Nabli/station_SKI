package tn.esprit.station_ski.entity;

import jakarta.persistence.*;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  long numPiste ;
    @Enumerated(EnumType.STRING)
  String nomPiste;
    @Enumerated(EnumType.STRING)
  Couleur couleur;
  int longueur;
}
