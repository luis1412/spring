package com.example.dietista.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="Dietista")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dietista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idDietista;

    @Column(name = "nombre")
    String nombre;

    @OneToMany(mappedBy = "dietaId", cascade = CascadeType.ALL)
    List<Dietas> Dietas;

}
