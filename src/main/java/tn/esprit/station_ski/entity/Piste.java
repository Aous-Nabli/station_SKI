package tn.esprit.station_ski.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  long numPiste ;

  String nomPiste;
    @Enumerated(EnumType.STRING)
  Couleur couleur;
  int longueur;

  @ManyToMany
    private List<Sikeur> sikeur;
}
