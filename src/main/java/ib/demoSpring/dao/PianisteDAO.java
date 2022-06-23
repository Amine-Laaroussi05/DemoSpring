package ib.demoSpring.dao;

import ib.demoSpring.entity.Pianiste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PianisteDAO extends JpaRepository<Pianiste,Long> {
}
