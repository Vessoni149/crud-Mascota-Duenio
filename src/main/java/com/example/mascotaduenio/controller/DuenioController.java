
package com.example.mascotaduenio.controller;

import com.example.mascotaduenio.dto.MascotaDto;
import com.example.mascotaduenio.model.Duenio;
import com.example.mascotaduenio.model.Mascota;
import com.example.mascotaduenio.service.IDuenioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenioController {
    
    @Autowired
    private IDuenioService duenioServ;
    
    @GetMapping
    public String home(){
        return "home";
    }
    
    @GetMapping("/duenios/traer")
    public List<Duenio> getDuenios(){
        List<Duenio> listaDuenios = duenioServ.getDuenios();
        return listaDuenios;
    }
    
    @GetMapping("/duenios/traer/{id}")
    public Duenio getDuenio(@PathVariable Long id){
        Duenio duenio = duenioServ.findDuenio(id);
        return duenio;
    }
    
    @PostMapping("/duenios/crear")
    public String crearDuenio(@RequestBody Duenio duenio){
        duenioServ.saveDuenio(duenio);
        return "Dueño creado";   
    }
    
    @DeleteMapping("/duenios/borrar/{id}")
    public String deleteDuenio(@PathVariable Long id){
        duenioServ.deleteDuenio(id);
        return "Dueño eliminado";
    }
    
    @PutMapping("/duenios/editar")
    public String editDuenio(@RequestBody Duenio duenio){
        duenioServ.editDuenio(duenio);
        return "Dueño editado";
    }
    
     @GetMapping("/mascotaduenio/{id}")
    @ResponseBody
    public List<MascotaDto> getMascotaDto(@PathVariable Long id){
        List<MascotaDto> listaMascotasDto = duenioServ.getMascoDuenios(id);
        return listaMascotasDto;
    }
    
}
