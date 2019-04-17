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
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Girasol girasol = new Girasol("G", 2, 4, 7);
        Celda celda = new Celda();
        Celda tablero[][];
        tablero = new Celda[5][9];
        Tablero tableroM =new Tablero(tablero);
        

        tableroM.imprimirTableroVacio(5,9);
    }

}
