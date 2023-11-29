
package com.example.mascotaduenio.repository;

import com.example.mascotaduenio.model.Duenio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenioRepository extends JpaRepository<Duenio, Long>{
    
}
