package com.sqa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sqa.models.entities.Nguoinopthue;


@Repository
public interface UserRepository extends JpaRepository<Nguoinopthue, String>{

}
