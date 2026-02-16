package tn.esprit.station_ski.service;

import org.springframework.stereotype.Service;
import tn.esprit.station_ski.entity.Piste;
import tn.esprit.station_ski.repository.IPisteRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PisteServiceImpl implements IPisteService {
        IPisteRepo pisteRepo;

    @Override
    public Piste addPiste(Piste piste) {

        return pisteRepo.save(piste);

    }

    @Override
    public Piste updatePiste(Long idPiste, String nomPiste) {
        Piste p = pisteRepo.findById(idPiste).orElse(null);
        p.setNomPiste(nomPiste);
        return pisteRepo.save(p);
    }

    @Override
    public void deletePiste(Long idPiste) {
    pisteRepo.deleteById(idPiste);
    }

    @Override
    public List<Piste> getAllPiste() {
        return pisteRepo.findAll();
    }

    @Override
    public Piste getPisteById(Long idPiste) {
        return pisteRepo.findById(idPiste).orElse(null);
    }
}
