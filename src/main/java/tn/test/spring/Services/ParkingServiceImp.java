package tn.test.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Parking;
import tn.test.spring.Entity.Personnel;
import tn.test.spring.Entity.Zone;
import tn.test.spring.Repository.ParkingRepository;

import javax.transaction.Transactional;
import java.util.List;


@Service

public class ParkingServiceImp implements ParkingService {


    @Autowired
    ParkingRepository parkingRepository;

    @Override
    @Transactional
    public void ajouterParkingeZone(Parking parking) {
        Parking p = parkingRepository.save(parking);
        System.out.println(p.getZones());
for (Zone z : p.getZones()) {
            z.setParking(p);
        }
    }


    @Override
    public List<Personnel> getAllPersonnelByParking(Parking parking) {
      List<Personnel> p =   parking.getPersonnel
    }
}

