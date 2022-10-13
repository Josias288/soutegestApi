package com.tufer.repository;

import com.tufer.model.Ravitaillement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RavitaillementRepository extends CrudRepository<Ravitaillement, Long> {

}
