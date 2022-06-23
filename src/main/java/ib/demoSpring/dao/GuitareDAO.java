package ib.demoSpring.dao;

import ib.demoSpring.entity.Guitare;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuitareDAO extends JpaRepository<Guitare,Long> {

    /**
     * public List<Guitare> findAll();
     * public Guitare findById(Long Id);
     * public List<Guitare> findByATT (Type ATT);
     * + find avec toutes les combinaisons possibles
     * public Guitare create(Guitare obj);
     * public void update(Guitare obj);
     * public Guitare delete(Guitare obj);
     */



}
