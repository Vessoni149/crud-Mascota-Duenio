
package com.example.mascotaduenio.service;


import com.example.mascotaduenio.model.Mascota;
import com.example.mascotaduenio.repository.IDuenioRepository;
import com.example.mascotaduenio.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    private IMascotaRepository mascoRepo;
    

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascotas = mascoRepo.findAll();
        return listaMascotas;
    }

    @Override
    public void saveMascota(Mascota mascota) {
        mascoRepo.save(mascota);
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        Mascota masco = mascoRepo.findById(id).orElse(null);
        return masco;
    }

    @Override
    public void editMascota(Mascota mascota) {
       this.saveMascota(mascota);
    }

     @Override
    public List<Mascota> getCaniches() {
        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaCaniches = new ArrayList<Mascota>();
        for(Mascota masco : listaMascotas){
            if(masco.getEspecie().equals("perro") && masco.getRaza().equals("caniche")){
                listaCaniches.add(masco);
            }
        }
        return listaCaniches;
    }

}
