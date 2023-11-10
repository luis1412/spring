package com.example.demo.services;


import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImplement implements EmpleadoService {
    @Override
    public String hello() {
        return "Hola empleado";
    }
}
