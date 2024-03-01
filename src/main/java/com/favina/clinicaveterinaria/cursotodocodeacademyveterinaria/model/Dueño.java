package com.favina.clinicaveterinaria.cursotodocodeacademyveterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private int dni;
    private String nombre;
    private String apellido;
    private String celular;
    @OneToMany(mappedBy = "owner_id" ,fetch = FetchType.LAZY)
    private List<Mascota> mascotas;
}
