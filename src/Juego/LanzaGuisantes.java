/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author Alvaro
 */
public class LanzaGuisantes extends Planta {
    
    private int daño;
    private int frecuenciaL;

    public LanzaGuisantes(int daño, int frecuenciaL, String nombre, int coste, int resistencia) {
        super(nombre, coste, resistencia);
        this.daño = daño;
        this.frecuenciaL = frecuenciaL;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getFrecuenciaL() {
        return frecuenciaL;
    }

    public void setFrecuenciaL(int frecuenciaL) {
        this.frecuenciaL = frecuenciaL;
    }

    @Override
    public String toString() {
        return this.getNombre() + "(" + this.getResistencia() + ")";
    }
    
}
