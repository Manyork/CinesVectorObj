/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiante
 */
public class Sala {
    private Integer idSala;
    private Integer capacidad;

    public Sala(Integer idSala, Integer capacidad) {
        this.idSala = idSala;
        this.capacidad = capacidad;
    }
    
   public Sala() {
        this.idSala = 0;
        this.capacidad = 0;
    }

    public Integer getIdSala() {
        return idSala;
    }

    public void setIdSala(Integer idSala) {
        this.idSala = idSala;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
       
    
    
}
