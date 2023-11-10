package com.example.demo.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service("Cliente A")
public class ClienteAServiceImplement implements ClienteService{
    @Override
    public String hello() {
        return "Hola desde ClienteA";
    }
}
