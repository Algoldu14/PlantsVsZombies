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
        return ("|----------|\n" + "|   " + this.getNPC().toString() + "   |\n" + "|----------|");
    }
     
}
