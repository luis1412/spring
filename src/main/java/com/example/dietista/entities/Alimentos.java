package com.example.dietista.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="alimentos")
public class Alimentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_alimento")
    int id_alimento;

    @Column(name = "nombre")
    String nombre;

    @Column(name="valor_calorico_100")
    int valor_calorico_100g;

    @Column(name="grasas")
    int grasas;

}
