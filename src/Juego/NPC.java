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
public class NPC {

    private String nombre;
    private int daño;
    private int resistencia;
    private int frecuencia;

    public NPC(String nombre, int daño, int resistencia, int frecuencia) {
        this.nombre = nombre;
        this.daño = daño;
        this.resistencia = resistencia;
        this.frecuencia = frecuencia;
    }

    public NPC() {
    } //constructor para las celdas vacías

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    @Override
    public String toString() {
        return "|    ";
    }

    
}
