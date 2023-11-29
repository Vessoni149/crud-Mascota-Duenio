
package com.example.mascotaduenio.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDto {
    public Long id;
    public String nombre;
    public String especie;
    public String raza;
    public String nombreDuenio;
    public String apellidoDuenio;
}
