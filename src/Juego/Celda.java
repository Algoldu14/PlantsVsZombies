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
La clase Celda es el objeto que introducimos en la matriz del tablero. Dentro de ella 
estan los NPCs.
*/
public class Celda {
    
    private NPC NPC;

    public Celda(NPC NPC) {
        this.NPC = NPC;
    }

    public NPC getNPC() {
        return NPC;
    }

    public void setNPC(NPC NPC) {
        this.NPC = NPC;
    }
    
    
    @Override
    public String toString() {
        return this.getNPC().toString();
    }
    
}
