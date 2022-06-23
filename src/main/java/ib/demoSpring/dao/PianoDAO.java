package ib.demoSpring.dao;

import ib.demoSpring.entity.Piano;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PianoDAO extends JpaRepository<Piano,Long> {
}
