/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Tanda;

/**
 *
 * @author Estudiante
 */
public class DatosTanda {

    private int numRegs;
    private final Tanda vect[];

    public DatosTanda(int tamVect) {
        this.numRegs = 0;
        this.vect = new Tanda[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    private void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Tanda[] getVect() {
        return vect;
    }

    public boolean insertTanda(Tanda peliObj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = peliObj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public Tanda getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean alreadyExist(int id) {
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (vect[i].getIdTanda()== id) {

                    return true;
                }
            }
        }

        return false;
    }

}
