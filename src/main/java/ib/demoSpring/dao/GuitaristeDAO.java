package ib.demoSpring.dao;

import ib.demoSpring.entity.Guitariste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuitaristeDAO extends JpaRepository<Guitariste,Long> {
}
