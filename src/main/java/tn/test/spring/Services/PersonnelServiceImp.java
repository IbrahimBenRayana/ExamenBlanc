package tn.test.spring.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.test.spring.Entity.Personnel;
import tn.test.spring.Repository.PersonnelRepository;
import tn.test.spring.Repository.zoneRepository;


@Service

public class PersonnelServiceImp implements PersonnelService {

    @Autowired
    PersonnelRepository personnelRepository;
    @Autowired
    zoneRepository zoneReposit;



    @Override
    public Personnel addPersonnel(Personnel p) {
        return null;
    }

    @Override
    public void affecterPersonnelZone(Long idPersonnel, Long idZone) {
        Personnel p = personnelRepository.findById(idPersonnel).get();
        p.setZone(zoneReposit.findById(idZone).get());
        personnelRepository.save(p);
    }
}

