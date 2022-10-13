package com.tufer.controller;

import com.tufer.model.Servic;
import com.tufer.service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    /**
     * Read - Get all societes
     * 
     * @return -
     */
    @GetMapping("/services")
    public Iterable<Servic> getServices() {
        return serviceService.getServices();
    }

    @PostMapping("/service/save")
    public Servic saveService(Servic service) {
        return serviceService.saveService(service);
    }

    @GetMapping("/service/{id}")
    public Optional<Servic> getService(final Long id) {
        return serviceService.getService(id);
    }

    @DeleteMapping("/service/{id}")
    public void deleteService(final Long id) {
        serviceService.deleteService(id);
    }
}
