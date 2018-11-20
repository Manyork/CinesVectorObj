/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Sala;

/**
 *
 * @author 
 */
public class DatosSala {

    private int numRegs;
    private final Sala vect[];

    public DatosSala(int tamVect) {
        this.numRegs = 0;
        this.vect = new Sala[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    private void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Sala[] getVect() {
        return vect;
    }

    public boolean insertSala(Sala peliObj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = peliObj;
            this.numRegs++;
            return true;
        }
        return false;
    }
    
    public boolean editaPelicula (int pos, Sala salaObj){
        if (pos>=0 && pos < this.numRegs){
            this.vect[pos]=salaObj;
            return true;
        }
        return false;
    }

    public Sala getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean alreadyExist(int id) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (vect[i].getIdSala()== id) {

                    return true;
                }
            }
        }

        return false;
    }

}
