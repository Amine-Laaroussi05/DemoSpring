package ib.demoSpring.dao;

import ib.demoSpring.entity.Cornemuse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CornemuseDAO extends JpaRepository<Cornemuse,Long> {
}
