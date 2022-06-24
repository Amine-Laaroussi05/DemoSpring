package ib.demoSpring.service;


import ib.demoSpring.dao.GuitareDAO;
import ib.demoSpring.entity.Guitare;
import ib.demoSpring.entity.Instrument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * Classe de service de l'entité guitare
 * @author amine
 */

@Service
public class GuitareService {

    @Autowired
    private GuitareDAO guitareDAO;

    public List<Guitare> findAll(){
        return this.guitareDAO.findAll();
    }

    public Guitare findById(Long id){
        Optional<Guitare> optionalGuitare =  this.guitareDAO.findById(id);
        if(optionalGuitare.isPresent()){
            return optionalGuitare.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


    public List<Guitare> findByModel(String model){
        return this.guitareDAO.findByModel(model);
    }

    public Guitare create(Guitare guitare){
        return this.guitareDAO.save(guitare);
    }

    public Guitare update(Guitare guitare){
        if(!this.guitareDAO.existsById(guitare.getId())){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de mettre à jour la guitare");
        }
        return this.guitareDAO.save(guitare);
    }

    public void delete(Long id){
        if (!this.guitareDAO.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        this.guitareDAO.deleteById(id);
        if (this.guitareDAO.existsById(id)){
            throw new ResponseStatusException(HttpStatus.EXPECTATION_FAILED);
        }
    }


}
