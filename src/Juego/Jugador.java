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
public class Jugador {

    private String nombre;
    private int soles;

    public Jugador(String nombre, int soles) {
        this.nombre = nombre;
        this.soles = soles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSoles() {
        return soles;
    }

    public void setSoles(int soles) {
        this.soles = soles;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " \n Tienes: " + soles + " soles.";
    }

}
