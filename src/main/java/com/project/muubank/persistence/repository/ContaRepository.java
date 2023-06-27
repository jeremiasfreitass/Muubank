package com.project.muubank.persistence.repository;

import com.project.muubank.persistence.entity.Conta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends MongoRepository<Conta, String> {

}
