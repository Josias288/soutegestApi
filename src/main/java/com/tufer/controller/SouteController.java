package com.tufer.controller;

import com.tufer.model.Soute;
import com.tufer.service.SouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SouteController {
    @Autowired
    private SouteService souteService;

    /**
     * Read - Get all societes
     * 
     * @return -
     */
    @GetMapping("/soutes")
    public Iterable<Soute> getSoutes() {
        return souteService.getSoutes();
    }

    @PostMapping("/soute/save")
    public Soute saveSoute(Soute soute) {
        return souteService.saveSoute(soute);
    }

    @GetMapping("/soute/{id}")
    public Optional<Soute> getSoute(final Long id) {
        return souteService.getSoute(id);
    }

    @DeleteMapping("/soute/{id}")
    public void deleteSoute(final Long id) {
        souteService.deleteSoute(id);
    }
}
