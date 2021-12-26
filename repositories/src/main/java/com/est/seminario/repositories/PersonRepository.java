package com.est.seminario.repositories;

import com.est.seminario.models.Entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {


}
