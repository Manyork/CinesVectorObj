/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Logica.Programacion;

/**
 *
 * @author Jon
 */
public class DatosProgramacion {

    private int numRegs;
    private Programacion vect[];

    public DatosProgramacion(int tamVect) {
        this.numRegs = 0;
        this.vect = new Programacion[tamVect];
    }

    public int getNumRegs() {
        return numRegs;
    }

    private void setNumRegs(int numRegs) {
        this.numRegs = numRegs;
    }

    public Programacion[] getVect() {
        return vect;
    }

    public boolean insertProgramacion(Programacion PrograObj) {
        if (this.numRegs < this.vect.length - 1) {
            this.vect[numRegs] = PrograObj;
            this.numRegs++;
            return true;
        }
        return false;
    }

    public boolean eliminarProgramacion(int pos) {
        if (this.numRegs > 1) {
            for (int i = 0; i < this.numRegs; i++) {
                if (i == pos) {
                    for (int j = i; j < this.numRegs - 1; j++) {
                        vect[j] = vect[j + 1];
                    }
                }
            }
            this.numRegs--;
            return true;

        }
        return false;

    }

    public boolean editaProgramacion(int pos, Programacion PrograObj) {
        if (pos >= 0 && pos < this.numRegs) {
            this.vect[pos] = PrograObj;
            return true;
        }
        return false;
    }

    public Programacion getRegistro(int pos) {
        return this.vect[pos];
    }

    public boolean yaExiste(int id) {
        System.err.println(this.getNumRegs());
        if (this.numRegs != 0) {
            for (int i = 0; i < this.numRegs; i++) {
                if (this.vect[i].getIdProgramacion() == id) {
                    return true;
                }
            }
        }
        return false;
    }

}
