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
                Celda celda = new Celda(null); //metemos celdas vacías
                matrizTablero[i][j] = celda;
            }
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println(matrizTablero[i][j].toString());

            }

        }

    }

    public void introducirNPC (String comando) {

        String arrayComando[] = comando.split(" ");
        int filaM = Integer.parseInt(arrayComando[1]);
        int columnaM = Integer.parseInt(arrayComando[2]);
        
        if (arrayComando[0].equals("G")) {
            Girasol girasol = new Girasol("G",20,0,3,2);
            matrizTablero[filaM][columnaM].setNPC(girasol);
        } else if (arrayComando[0].equals("L")) {
            LanzaGuisantes LG = new LanzaGuisantes("L",50,1,3,1);
            matrizTablero[filaM][columnaM].setNPC(LG);
        } else {
            System.out.println("Error, NPC mal introducido :(");
        }
    }

}
