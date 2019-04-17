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
public class Girasol extends Planta{
    
    private int frencuenciaG;

    public Girasol( String nombre,int frencuenciaG, int coste, int resistencia) {
        super(nombre, coste, resistencia);
        this.frencuenciaG = frencuenciaG;
    }

    public int getFrencuenciaG() {
        return frencuenciaG;
    }

    public void setFrencuenciaG(int frencuenciaG) {
        this.frencuenciaG = frencuenciaG;
    }

    @Override
    public String toString() {
        return this.getNombre() + "(" + this.getResistencia() + ")";
    }
    
}
