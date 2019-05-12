/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

/**
 *
 * @author Alvaro y Patricia
 */

/*
La clase ZombieComun hereda de NPC y son los enemigos del juego.
*/
public class ZombieComun extends NPC {

    public ZombieComun(String nombre, int daño, int resistencia, int frecuencia) {
        super(nombre, daño, resistencia, frecuencia);
    }

    @Override
    public String toString() {
        return this.getNombre() + "(" + this.getResistencia() + ")    ";
    }

}
