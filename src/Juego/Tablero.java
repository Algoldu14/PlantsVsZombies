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
public class Tablero {

    private Celda matrizTablero[][];

    public Tablero(Celda[][] matrizTablero) {
        this.matrizTablero = matrizTablero;
    }

    public void imprimirTableroVacio(int filas, int columnas) {

        matrizTablero = new Celda[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Celda celdaV = new Celda();
                matrizTablero[i][j] = celdaV;
            }
        }

        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                System.out.println(matrizTablero[i][j].toString());
                
                
            }

        }

    }

}
