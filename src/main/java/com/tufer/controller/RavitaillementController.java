package com.tufer.controller;

import com.tufer.model.Ravitaillement;
import com.tufer.service.RavitaillementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RavitaillementController {
    @Autowired
    private RavitaillementService ravitaillementService;

    /**
     * Read - Get all societes
     * 
     * @return -
     */
    @GetMapping("/ravitaillements")
    public Iterable<Ravitaillement> getRavitaillements() {
        return ravitaillementService.getRavitaillements();
    }

    @PostMapping("/ravitaillement/save")
    public Ravitaillement saveRavitaillement(Ravitaillement ravitaillement) {
        return ravitaillementService.saveRavitaillement(ravitaillement);
    }

    @GetMapping("/ravitaillement/{id}")
    public Optional<Ravitaillement> getRavitaillement(final Long id) {
        return ravitaillementService.getRavitaillement(id);
    }

    @DeleteMapping("/ravitaillement/{id}")
    public void deleteRavitaillemnt(final Long id) {
        ravitaillementService.deleteRavitaillement(id);
    }
}
