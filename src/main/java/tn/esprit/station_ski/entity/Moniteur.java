package tn.esprit.station_ski.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMoniteur ;
    String nomM;
    String prenom;
    LocalDate dateRecu ;
    @OneToMany
    private List<Cours> cours;


}
