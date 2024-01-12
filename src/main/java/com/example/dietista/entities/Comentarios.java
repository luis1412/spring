package com.example.dietista.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "comentarios")
public class Comentarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="comentarioId")
    int comentarioId;

    @Column(name="titulo")
    String titulo;

    @Column(name="descripcion")
    String descripcion;

}
