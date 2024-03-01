package com.favina.clinicaveterinaria.cursotodocodeacademyveterinaria.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MascotaDueñoDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_dueño;
    private String apellido_dueño;
}
