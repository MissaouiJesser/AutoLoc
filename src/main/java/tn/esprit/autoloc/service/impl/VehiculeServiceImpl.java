package tn.esprit.autoloc.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repository.VehiculeRepository;
import tn.esprit.autoloc.service.interfaces.IVehiculeService;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Set<Vehicule> retrieveAllVehicules() {
        return new HashSet<>(vehiculeRepository.findAll());
    }

    @Override
    public Vehicule retrieveVehicule(Long vehiculeId) {
        return vehiculeRepository.findById(vehiculeId).get();
    }

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void removeVehicule(Long vehiculeId) {
        vehiculeRepository.deleteById(vehiculeId);
    }

    @Override
    public Vehicule modifyVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}