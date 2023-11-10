package com.example.demo.primary;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("Cliente B")
public class ClienteBServiceImplement implements ClienteService{
    @Override
    public String hello() {
        return "Hola desde cliente B";
    }
}
