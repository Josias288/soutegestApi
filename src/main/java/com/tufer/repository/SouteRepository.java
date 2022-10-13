package com.tufer.repository;

import com.tufer.model.Soute;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouteRepository extends CrudRepository<Soute, Long> {

}
