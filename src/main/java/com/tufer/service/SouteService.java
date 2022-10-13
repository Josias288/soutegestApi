package com.tufer.service;

import java.util.Optional;

import com.tufer.model.Soute;
import com.tufer.repository.SouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class SouteService {
    @Autowired
    private SouteRepository souteRepository;

    public Optional<Soute> getSoute(final Long id) {
        return souteRepository.findById(id);
    }

    public Iterable<Soute> getSoutes() {
        return souteRepository.findAll();
    }

    public void deleteSoute(final Long id) {
        souteRepository.deleteById(id);
    }

    public Soute saveSoute(Soute soute) {
        Soute savedSoute = souteRepository.save(soute);
        return savedSoute;
    }

}
