package ib.demoSpring.dao;

import ib.demoSpring.entity.Sonneur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SonneurDAO extends JpaRepository<Sonneur,Long> {

    @Query("SELECT s FROM Sonneur s WHERE s.nom = :nom")
    public List<Sonneur> findByNom(@Param("nom") String nom);
//    Voir JPQL pour la syntax, par exemple : https://www.bezkoder.com/jpa-native-query/ & https://thorben-janssen.com/jpql/


}
