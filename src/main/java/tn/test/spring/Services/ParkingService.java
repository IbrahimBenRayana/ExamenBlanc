package tn.test.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.test.spring.Entity.Parking;
import tn.test.spring.Entity.Personnel;
import tn.test.spring.Entity.Zone;
import tn.test.spring.Repository.ParkingRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface ParkingService {



public void ajouterParkingeZone(Parking parking);

List<Personnel> getAllPersonnelByParking(Parking parking);

}







