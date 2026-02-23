package tn.esprit.station_ski.service;

import tn.esprit.station_ski.entity.Piste;
import tn.esprit.station_ski.entity.Sikeur;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste piste) ;

    Piste updatePiste(Long idPiste, String  nomPiste);

    void deletePiste(Long idPiste) ;

    List<Piste> getAllPiste();

    Piste getPisteById(Long idPiste);

    Piste addPisteAndAssignToPiste(Piste p , Long numPiste);
}
