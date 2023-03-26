package com.sqa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sqa.models.entities.Nguoinopthue;




@Repository
public interface UserRepository extends JpaRepository<Nguoinopthue, String> {
    @Query(value = "Select e from Nguoinopthue e where e.masothue = :masothue")
    Nguoinopthue getByMaSoThue(@Param("masothue") String masothue);
}
