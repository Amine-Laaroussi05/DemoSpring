package ib.demoSpring.controller;

import ib.demoSpring.entity.Guitare;
import ib.demoSpring.entity.Instrument;
import ib.demoSpring.service.GuitareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/guitares")
public class GuitareController {

    @Autowired
    private GuitareService guitareService;

    @GetMapping("")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Guitare> findAll(){
        return this.guitareService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Guitare findById(@PathVariable long id){
        return this.guitareService.findById(id);
    }

    @GetMapping("/model/{model}")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Guitare> findByModel(@PathVariable String model){
        return this.guitareService.findByModel(model);
    }

    @PostMapping("")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Guitare create(@RequestBody Guitare guitare){
        return this.guitareService.create(guitare);
    }

    @PostMapping("/{id}")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Guitare update(@RequestBody Guitare guitare, @PathVariable Long id){
        if (!id.equals(guitare.getId())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "mauvaise guitare à mettre à jour");
        }
        return this.guitareService.update(guitare);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.GONE)
    public void delete(@PathVariable Long id){
        this.guitareService.delete(id);
    }




}
