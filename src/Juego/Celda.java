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

    private LanzaGuisantes LanzaGuisantes = null;
    private Girasol Girasol = null;
    private ZombieComun Zombie = null;

    public Celda() {
    }

    public LanzaGuisantes getLanzaGuisantes() {
        return LanzaGuisantes;
    }

    public void setLanzaGuisantes(LanzaGuisantes LanzaGuisantes) {
        this.LanzaGuisantes = LanzaGuisantes;
    }

    public Girasol getGirasol() {
        return Girasol;
    }

    public void setGirasol(Girasol Girasol) {
        this.Girasol = Girasol;
    }

    public ZombieComun getZombie() {
        return Zombie;
    }

    public void setZombie(ZombieComun Zombie) {
        this.Zombie = Zombie;
    }

    public String printCelda() { //Metodo para imprimir la celda dependiendo de lo que tenga

        String imprimir;

        if (this.getGirasol() != null) {

            imprimir = this.Girasol.toString();

        } else if (this.getLanzaGuisantes() != null) {

            imprimir = this.LanzaGuisantes.toString();

        } else if (this.getZombie() != null) {

            imprimir = this.Zombie.toString();
        } else {
            imprimir = "    ";//Los cuatro espacios en blanco que ocupa si hay una cosa
        }

        return imprimir;
    }

    @Override
    public String toString() {
        return ("|----------|\n" + "|   " + this.printCelda() + "   |\n" + "|----------|");
    }

}
