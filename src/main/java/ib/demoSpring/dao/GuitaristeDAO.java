package ib.demoSpring.dao;

import ib.demoSpring.entity.Guitariste;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuitaristeDAO extends JpaRepository<Guitariste,Long> {
}
