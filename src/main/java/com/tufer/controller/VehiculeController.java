package com.tufer.controller;

import com.tufer.model.Vehicule;
import com.tufer.service.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class VehiculeController {
    @Autowired
    private VehiculeService vehiculeService;

    /**
     * Read - Get all societes
     * 
     * @return -
     */
    @GetMapping("/vehicules")
    public Iterable<Vehicule> getVehicules() {
        return vehiculeService.getVehicules();
    }

    @PostMapping("/vehicule/save")
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeService.saveVehicule(vehicule);
    }

    @GetMapping("/vehicule/{id}")
    public Optional<Vehicule> getVehicule(final Long id) {
        return vehiculeService.getVehicule(id);
    }

    @DeleteMapping("/vehicule/{id}")
    public void deleteVehicule(final Long id) {
        vehiculeService.deleteVehicule(id);
    }
}
