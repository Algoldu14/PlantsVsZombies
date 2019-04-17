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

    private LanzaGuisantes LanzaGuisantes;
    private Girasol Girasol;
    private ZombieComun Zombie;

    public Celda(LanzaGuisantes LanzaGuisantes, Girasol Girasol, ZombieComun Zombie) { //valores a nulo ya que de original no hay ninguna cosa
        this.LanzaGuisantes = null;
        this.Girasol = null;
        this.Zombie = null;
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

        } else {

            imprimir = this.Zombie.toString();
        }

        return imprimir;
    }

    @Override
    public String toString() {
        return this.printCelda();
    }

}
