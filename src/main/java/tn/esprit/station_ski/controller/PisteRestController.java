package tn.esprit.station_ski.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.station_ski.entity.Piste;
import tn.esprit.station_ski.service.IPisteService;

import java.util.List;

@RestController
@RequestMapping("/piste")  //  elle va etre comme ca : http://localhost:8089/piste/
@AllArgsConstructor
public class PisteRestController {
    IPisteService pisteService;

    @PostMapping(path = "/")
    //http://localhost:8089/user/
    Piste addPiste(@RequestBody Piste piste){  //RequestBody
        return pisteService.addPiste(piste) ;
    }
@PutMapping(path = "/{id}/{nom-piste}")     //@patch pour un seul attribut  et put pour plusieurs
    Piste updatePiste(@PathVariable("id") Long idPiste,@PathVariable("nom-piste") String  nomPiste){ //pathvariable va met un varible dans path
        return pisteService.updatePiste(idPiste,nomPiste) ;
    }
@DeleteMapping(path = "/{id}")
    void deletePiste(@PathVariable("id") Long idPiste){
        pisteService.deletePiste(idPiste);
    }
@GetMapping(path = "/pistes")
    List<Piste> getAllPiste(){
        return pisteService.getAllPiste() ;
    }
@GetMapping(path = "/{id}")
    Piste getPisteById(@PathVariable Long idPiste){
        return pisteService.getPisteById(idPiste) ;
    }

}
