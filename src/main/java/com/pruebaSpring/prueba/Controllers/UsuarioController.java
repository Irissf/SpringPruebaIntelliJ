package com.pruebaSpring.prueba.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//indicamos que es un controllador
@RestController
public class UsuarioController {

    @RequestMapping(value = "prueba") // localhost:8080/prueba
    public List<String> prueba(){
        return List.of("爸爸","妈妈","弟弟");
    }

}