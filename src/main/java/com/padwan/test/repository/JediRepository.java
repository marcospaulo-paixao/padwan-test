package com.padwan.test.repository;

import com.padwan.test.entity.Jedi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JediRepository extends JpaRepository<Jedi, Integer> {

    
}
