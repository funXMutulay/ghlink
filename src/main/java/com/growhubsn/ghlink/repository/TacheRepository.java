package com.growhubsn.ghlink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.growhubsn.ghlink.model.Tache;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Long>{
    
}
