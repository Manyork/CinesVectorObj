/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Date;

/**
 *
 * @author Jon
 */
public class Programacion {

    private int idProgramacion;
    private Date hora;
     Pelicula pelicula;
     Sala sala;
     Tanda tanda;

    public Programacion(int idProgramacion, Date hora, Pelicula pelicula, Sala sala, Tanda tanda) {
        this.idProgramacion = idProgramacion;
        this.hora = hora;
        this.pelicula = pelicula;
        this.sala = sala;
        this.tanda = tanda;
    }
    
    public Programacion() {
        this.idProgramacion = 0;
        this.hora = null;
        this.pelicula = new Pelicula();
        this.sala = new Sala();
        this.tanda = new Tanda();
    }

    public int getIdProgramacion() {
        return idProgramacion;
    }

    public void setIdProgramacion(int idProgramacion) {
        this.idProgramacion = idProgramacion;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Tanda getTanda() {
        return tanda;
    }

    public void setTanda(Tanda tanda) {
        this.tanda = tanda;
    }
    
}
