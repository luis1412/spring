package com.example.demo;

import com.example.demo.controller.EmpleadoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.naming.Context;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
        var empleadoController = context.getBean(EmpleadoController.class);

        System.out.println(empleadoController.hello());
        System.out.println(empleadoController.helloCliente());

    }



}
