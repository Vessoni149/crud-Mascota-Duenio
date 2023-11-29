
package com.example.mascotaduenio.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Duenio {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public Long id;
    public int dni;
    public String nombre;
    public String apellido;
    public int celular;
    @OneToMany(cascade = CascadeType.ALL)
    public List<Mascota> listaMascotas;
}
