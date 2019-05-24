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
La clase Girasol hereda de NPC y es la productora de la moneda del juego.
*/
public class Girasol extends NPC {

    private int coste;

    public Girasol(String nombre, int coste, int daño, int resistencia, int frecuencia) {
        super(nombre, daño, resistencia, frecuencia);
        this.coste = coste;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    @Override
    public String toString() {
        return this.getNombre() + "  (" + this.getResistencia() + ")";
    }

}
