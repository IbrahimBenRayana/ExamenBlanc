package tn.test.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.test.spring.Entity.Zone;

@Repository
public interface zoneRepository extends JpaRepository<Zone, Long> {

}

