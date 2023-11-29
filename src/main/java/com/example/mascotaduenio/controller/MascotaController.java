package com.example.mascotaduenio.controller;


import com.example.mascotaduenio.model.Mascota;
import com.example.mascotaduenio.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    
    @Autowired
    private IMascotaService mascoServ;
    
    
    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascotas(){
        List<Mascota> listaMascotas = mascoServ.getMascotas();
        return listaMascotas;
    }
    
    @GetMapping("/mascotas/traer/{id}")
    public Mascota getMascota(@PathVariable Long id){
        Mascota masco = mascoServ.findMascota(id);
        return masco;
    }
    
    @PostMapping("/mascotas/crear")
    public String createMascota(@RequestBody Mascota masco){
        mascoServ.saveMascota(masco);
        return "Mascota creada";
    }
    
    @DeleteMapping("/mascotas/borrar/{id}")
    public String deleteMascota(@PathVariable Long id){
        mascoServ.deleteMascota(id);
        return "Mascota eliminada";
    }
    
    @PutMapping("/mascotas/editar")
    public String editMascota(@RequestBody Mascota masco){
        mascoServ.editMascota(masco);
        return "Mascota editada";
    }
    
    @GetMapping("/mascotas/traer/perrosCaniches")
    public List<Mascota> getCaniches(){
        List<Mascota> listaCaniches = mascoServ.getCaniches();
        return listaCaniches;
    }
    
}
