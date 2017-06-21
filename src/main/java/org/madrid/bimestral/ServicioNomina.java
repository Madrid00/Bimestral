/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.madrid.bimestral;

import org.springframework.stereotype.Service;

/**
 *
 * @author T-
 */
@Service
public class ServicioNomina {

public Nomina servicioPagarNomina(){

Nomina n= new TrabajadorPlanta();
return n;
}
    

}
