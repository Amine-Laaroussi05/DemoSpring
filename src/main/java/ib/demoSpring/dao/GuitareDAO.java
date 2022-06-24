package ib.demoSpring.dao;

import ib.demoSpring.entity.Guitare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuitareDAO extends JpaRepository<Guitare,Long> {

    public List<Guitare> findByModel(String model);

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
