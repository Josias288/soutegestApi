package com.tufer.service;

import com.tufer.model.Ravitaillement;
import com.tufer.repository.RavitaillementRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Data;

@Data
@Service
public class RavitaillementService {
    @Autowired
    private RavitaillementRepository ravitaillementRepository;

    public Optional<Ravitaillement> getRavitaillement(final Long id) {
        return ravitaillementRepository.findById(id);
    }

    public Iterable<Ravitaillement> getRavitaillements() {
        return ravitaillementRepository.findAll();
    }

    public void deleteRavitaillement(final Long id) {
        ravitaillementRepository.deleteById(id);
    }

    public Ravitaillement saveRavitaillement(Ravitaillement ravitaillement) {
        Ravitaillement savedRavitaillement = ravitaillementRepository.save(ravitaillement);
        return savedRavitaillement;
    }
}
