package com.pruebaSpring.prueba.controllers;

import com.pruebaSpring.prueba.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//indicamos que es un controllador
@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario") // localhost:8080/prueba
    public Usuario getUsuario(){
        Usuario user = new Usuario(1l,"Iris","sf,","iris@gmail.com"
        ,"123456789","aaaaaaa");
        return user;
    }

    @RequestMapping(value = "usuario/editar") // localhost:8080/prueba
    public String editarUsuario(){

        return "user";
    }

    @RequestMapping(value = "usuario/eliminar") // localhost:8080/prueba
    public String eliminarUsuario(){

        return "user";
    }

    @RequestMapping(value = "usuario/{id}") // localhost:8080/prueba
    public Usuario buscarUsuario(@PathVariable long id){
        Usuario user = new Usuario(id,"Iris","sf,","iris@gmail.com"
                ,"123456789","aaaaaaa");
        return user;
    }

}