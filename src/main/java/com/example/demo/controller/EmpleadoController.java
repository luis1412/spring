package com.example.demo.controller;

import com.example.demo.primary.ClienteService;
import com.example.demo.services.EmpleadoService;
import com.example.demo.services.EmpleadoServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @Qualifier("Cliente B")
    @Autowired
    private ClienteService clienteService;

    public String hello(){
        return empleadoService.hello();
    }

    public String helloCliente(){
        return this.clienteService.hello();
    }


}

