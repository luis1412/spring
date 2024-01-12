package com.example.dietista.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Dietas")
public class Dietas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int dietaId;
    enum Dias{
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }
    Dias diaSemana;

    @ManyToMany
    ArrayList<Alimentos> listaAlimentos;

}
