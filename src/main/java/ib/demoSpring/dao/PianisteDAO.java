package ib.demoSpring.dao;

import ib.demoSpring.entity.Pianiste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PianisteDAO extends JpaRepository<Pianiste,Long> {
}
