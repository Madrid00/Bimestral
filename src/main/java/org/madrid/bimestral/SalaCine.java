/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.madrid.bimestral;

/**
 *
 * @author T-
 */
public class SalaCine {
    
    private Integer id_sala;
    private String tituloPelicula;
    private String clasificacion;
    private Integer num_acientos;

    public SalaCine(Integer id_sala, String tituloPelicula, String clasificacion, Integer num_acientos) {
        this.id_sala = id_sala;
        this.tituloPelicula = tituloPelicula;
        this.clasificacion = clasificacion;
        this.num_acientos = num_acientos;
    }

    public SalaCine() {
    }

    public Integer getId_sala() {
        return id_sala;
    }

    public void setId_sala(Integer id_sala) {
        this.id_sala = id_sala;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getNum_acientos() {
        return num_acientos;
    }

    public void setNum_acientos(Integer num_acientos) {
        this.num_acientos = num_acientos;
    }
}
