package com.tufer.service;

import java.util.Optional;

import com.tufer.model.Servic;
import com.tufer.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;

    public Optional<Servic> getService(final Long id) {
        return serviceRepository.findById(id);
    }

    public Iterable<Servic> getServices() {
        return serviceRepository.findAll();
    }

    public void deleteService(final Long id) {
        serviceRepository.deleteById(id);
    }

    public Servic saveService(Servic service) {
        Servic savedService = serviceRepository.save(service);
        return savedService;
    }
}
