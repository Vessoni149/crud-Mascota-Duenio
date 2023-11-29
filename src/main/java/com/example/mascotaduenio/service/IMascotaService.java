
package com.example.mascotaduenio.service;

import com.example.mascotaduenio.dto.MascotaDto;
import com.example.mascotaduenio.model.Mascota;
import java.util.List;


public interface IMascotaService {
    public List<Mascota> getMascotas();
    public void saveMascota(Mascota mascota);
    public void deleteMascota(Long id);
    public Mascota findMascota(Long id);
    public void editMascota(Mascota mascota);
    public List<Mascota> getCaniches();
}
