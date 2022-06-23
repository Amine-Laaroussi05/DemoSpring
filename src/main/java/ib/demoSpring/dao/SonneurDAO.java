package ib.demoSpring.dao;

import ib.demoSpring.entity.Sonneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SonneurDAO extends JpaRepository<Sonneur,Long> {

    @Query("SELECT s FROM sonneur s WHERE s.nom = :nom")
    public List<Sonneur> findByNom(@Param("nom") String nom);


}
