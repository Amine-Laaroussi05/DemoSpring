package ib.demoSpring.dao;

import ib.demoSpring.entity.Sonneur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SonneurDAO extends JpaRepository<Sonneur,Long> {
}
