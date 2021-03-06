/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.madrid.bimestral;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author T-
 */
@Entity
@Table(name="direccion")
public class Direccion {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private Integer numero;
    private String calle;
    private Long CP;
    private String municipio;

    public Direccion() {
    }

    public Direccion(Long id, Integer numero, String calle, Long CP, String municipio) {
        this.id = id;
        this.numero = numero;
        this.calle = calle;
        this.CP = CP;
        this.municipio = municipio;
    }

    public Direccion(Integer numero, String calle, Long CP, String municipio) {
        this.numero = numero;
        this.calle = calle;
        this.CP = CP;
        this.municipio = municipio;
    }

    public Direccion(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Direccion{" + "numero=" + numero + ", calle=" + calle + ", CP=" + CP + ", municipio=" + municipio + '}';
    }
    

    /**
     * @return the numero
     */
    public Integer getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the CP
     */
    public Long getCP() {
        return CP;
    }

    /**
     * @param CP the CP to set
     */
    public void setCP(Long CP) {
        this.CP = CP;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
