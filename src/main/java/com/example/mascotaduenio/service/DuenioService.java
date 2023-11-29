
package com.example.mascotaduenio.service;

import com.example.mascotaduenio.dto.MascotaDto;
import com.example.mascotaduenio.model.Duenio;
import com.example.mascotaduenio.model.Mascota;
import com.example.mascotaduenio.repository.IDuenioRepository;
import com.example.mascotaduenio.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenioService implements IDuenioService{
    @Autowired
    private IDuenioRepository duenioRepo;
    
    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Duenio> getDuenios() {
        List<Duenio> listaDuenios = duenioRepo.findAll();
        return listaDuenios;
    }

    @Override
    public void saveDuenio(Duenio duenio) {
        duenioRepo.save(duenio);
    }

    @Override
    public void deleteDuenio(Long id) {
        duenioRepo.deleteById(id);
    }

    @Override
    public Duenio findDuenio(Long id) {
       Duenio duenio = duenioRepo.findById(id).orElse(null);
       return duenio;
    }

    @Override
    public void editDuenio(Duenio duenio) {
        this.saveDuenio(duenio);
    }
    
    @Override
    public List<MascotaDto> getMascoDuenios(Long id) {
        
        List<MascotaDto> listaMascoDto = new ArrayList<MascotaDto>();
        Duenio duenio = this.findDuenio(id);
        
        for (Mascota masco : duenio.getListaMascotas()) {
        
            MascotaDto masco_duenio = new MascotaDto();
        
            masco_duenio.setNombreDuenio(duenio.getNombre());
            masco_duenio.setApellidoDuenio(duenio.getApellido());
            masco_duenio.setNombre(masco.getNombre());
            masco_duenio.setEspecie(masco.getEspecie());
            masco_duenio.setRaza(masco.getRaza());
            
            listaMascoDto.add(masco_duenio);
            masco_duenio = new MascotaDto();//reseteo
        }
        return listaMascoDto;
    }
    
}
