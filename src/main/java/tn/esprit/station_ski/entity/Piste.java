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
//mappedby la class la plus faible d'attiribut l plus faible )
  @ManyToMany(mappedBy = "piste")
    private List<Sikeur> sikeur;
}
