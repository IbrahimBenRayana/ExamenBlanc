package tn.test.spring.Services;

import tn.test.spring.Entity.Personnel;

public interface PersonnelService {

    Personnel addPersonnel(Personnel p);

    void affecterPersonnelZone(Long idPersonnel, Long idZone);


}
