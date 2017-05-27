/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.madrid.bimestral;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author T-
 */
@RestController
@CrossOrigin //Solo para N Servidores
public class ControladorHola {
    
    @RequestMapping(value="/hola/{mensaje}", method=RequestMethod.GET, headers = {"Accept=text/html"})
    //@RequestMapping(value="/hola/{mensaje}", method=RequestMethod.GET, headers = {"Accept=application/vnd.ms-excel"}) 
    public String saludar(@PathVariable String mensaje){
        String algo ="Bienvenido " + mensaje;
        return algo;
    }
    
    @RequestMapping(value="/usuario", method=RequestMethod.GET, headers={"Accept=application/json"})
    public ArrayList <Usuario> obtener(){
    
    Usuario u1= new Usuario("Cesar", "Madrid", 21);
    Usuario u2= new Usuario("Pendejo", "Mauricio", 23);
    
    ArrayList<Usuario> usuarios = new ArrayList<>();
    usuarios.add(u1);
    usuarios.add(u2);
    return usuarios;
    
    }
}
