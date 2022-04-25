package com.pruebaSpring.prueba.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indicamos que es un controllador
@RestController
public class UsuarioController {

    @RequestMapping(value = "prueba")
    public String prueba(){
        return "prueba";
    }
}
