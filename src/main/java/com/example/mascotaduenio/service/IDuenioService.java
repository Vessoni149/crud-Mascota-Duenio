
package com.example.mascotaduenio.service;

import com.example.mascotaduenio.dto.MascotaDto;
import com.example.mascotaduenio.model.Duenio;
import java.util.List;


public interface IDuenioService {
    public List<Duenio> getDuenios();
    public void saveDuenio(Duenio duenio);
    public void deleteDuenio(Long id);
    public Duenio findDuenio(Long id);
    public void editDuenio(Duenio duenio);
    public List<MascotaDto> getMascoDuenios(Long id);
}
