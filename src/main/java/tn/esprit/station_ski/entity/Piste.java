package tn.esprit.station_ski.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
//on ajoute ca dans une autre seance
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor //
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  long numPiste ;

  String nomPiste;
    @Enumerated(EnumType.STRING)
  Couleur couleur;
  int longueur;
//mappedby la class la plus faible d'attiribut l plus faible )   ( tous ce qui est biderectionnnel et mapping) ( mapped by fils dans la class fils  )

  @ManyToMany(mappedBy = "piste")
    private List<Sikeur> sikeur;
}
