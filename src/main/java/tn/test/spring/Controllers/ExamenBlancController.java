package tn.test.spring.Controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.test.spring.Entity.Parking;
import tn.test.spring.Entity.Personnel;
import tn.test.spring.Entity.Zone;
import tn.test.spring.Repository.ParkingRepository;
import tn.test.spring.Repository.PersonnelRepository;
import tn.test.spring.Services.ParkingService;
import tn.test.spring.Services.ParkingServiceImp;
import tn.test.spring.Services.PersonnelServiceImp;

import javax.transaction.Transactional;

@RestController
@Slf4j
@RequestMapping("/rest")
public class ExamenBlancController {


    @Autowired
    PersonnelRepository personnelRepository;
    @Autowired
    PersonnelServiceImp personnelServiceImp;
    @Autowired
    ParkingRepository parkingRepository;
    @Autowired
    ParkingServiceImp parkingServiceImp;

@PostMapping("/add")
public void addPersonnel(@RequestBody Personnel p ){

    personnelRepository.save(p);

}

@PostMapping("/AddParkingAndZones")
public void addParkingAndZones(@RequestBody Parking pr){
    parkingServiceImp.ajouterParkingeZone(pr);
    }

    @GetMapping("/getParking")
    public Parking getAllParking(){
        return parkingRepository.findAll().get(0);
    }


   @PostMapping("/affecterPersonnelZone")
    public void affecterPersonnelZone(@RequestParam Long idPersonnel,@RequestParam Long idZone){
       personnelServiceImp.affecterPersonnelZone(idPersonnel,idZone);
    }


}




