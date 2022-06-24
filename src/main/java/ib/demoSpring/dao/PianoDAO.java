package ib.demoSpring.dao;

import ib.demoSpring.entity.Piano;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PianoDAO extends JpaRepository<Piano,Long> {
}
