package ib.demoSpring.dao;

import ib.demoSpring.entity.Cornemuse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CornemuseDAO extends JpaRepository<Cornemuse,Long> {
}
