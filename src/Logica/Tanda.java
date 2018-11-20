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
public class Tanda {

    private int idTanda;
    private Date hora;

    public Tanda() {
        this.idTanda = 0;
        this.hora = null;
    }

    public Tanda(int idTanda, Date hora) {
        this.idTanda = idTanda;
        this.hora = hora;
    }

    public int getIdTanda() {
        return idTanda;
    }

    public void setIdTanda(int idTanda) {
        this.idTanda = idTanda;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

}
