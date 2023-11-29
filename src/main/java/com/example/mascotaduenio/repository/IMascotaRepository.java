
package com.example.mascotaduenio.repository;


import com.example.mascotaduenio.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota, Long>{
    
}
