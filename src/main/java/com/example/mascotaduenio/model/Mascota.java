
package com.example.mascotaduenio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public Long id;
    public String nombre;
    public String especie;
    public String raza;
    public String color;
}
