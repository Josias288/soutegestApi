package com.tufer.repository;

import com.tufer.model.Servic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CrudRepository<Servic, Long> {

}
