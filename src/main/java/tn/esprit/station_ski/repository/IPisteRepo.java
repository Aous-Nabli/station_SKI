package tn.esprit.station_ski.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.station_ski.entity.Piste;

@Repository //c'est une java bean +options
public interface IPisteRepo extends JpaRepository<Piste,Long>{







}