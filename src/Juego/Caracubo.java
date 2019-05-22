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
public class Caracubo extends NPC {

    public Caracubo(String nombre, int daño, int resistencia, int frecuencia) {
        super(nombre, daño, resistencia, frecuencia);
    }
    
    @Override
    public String toString() {
        return this.getNombre() + "(" + this.getResistencia() + ")    ";
    }
}
