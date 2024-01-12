package com.example.dietista.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="clientes")
public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cliente")
    int id_cliente;

    @Column(name = "nombre")
    String nombre;
    @Column(name="apellidos")
    String apellidos;

    @Column(name="dni")
    String DNI;

    @Column(name="email")
    String email;

    @OneToMany(mappedBy = "comentarioId", cascade = CascadeType.ALL)
    List<Comentarios> ComentariosLista;


}
