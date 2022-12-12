package tn.test.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.test.spring.Entity.Parking;
import tn.test.spring.Entity.Personnel;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Long> {

}

