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

        Celda[][] matriz=new Celda[0][0];
        Tablero tablero=new Tablero(matriz,2);
        tablero.crearTablero(8,9);
       
       
       tablero.imprimirTablero(tablero.crearTablero(8,9));
       
    }

}
