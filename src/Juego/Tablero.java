/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Random;

/**
 *
 * @author Alvaro
 */
public class Tablero {

    private Celda matrizTablero[][];
    private int turno;

    public Tablero(Celda[][] matrizTablero, int turno) {
        this.matrizTablero = matrizTablero;
        this.turno = turno;
    }

    public void actualizarTablero(String comando) {
        comando = comando.toUpperCase();
        String arrayComando[] = comando.split(" ");

        switch (arrayComando[0]) {
            case "N": //Si en el comando hay una N inicia el juego
                this.imprimirTableroVacio(Integer.parseInt(arrayComando[1]), Integer.parseInt(arrayComando[2]));
                break;
            case "L": //Si son las plantas
                this.introducirPlanta(comando);
                break;
            case "G":
                this.introducirPlanta(comando);
                break;
            default:
                System.out.println("Error al introducir el comando.");
                break;
        }

        this.turno++;
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
                System.out.print(matrizTablero[i][j].toString());

            }

        }

    }

    public void introducirPlanta(String comandoJuego) {

        String arrayComando[] = comandoJuego.split(" ");
        int filaM = Integer.parseInt(arrayComando[1]);
        int columnaM = Integer.parseInt(arrayComando[2]);

        switch (arrayComando[0]) {
            case "G":
                Girasol girasol = new Girasol("G", 20, 0, 3, 2);
                matrizTablero[filaM][columnaM].setNPC(girasol);
                break;
            case "L":
                LanzaGuisantes LG = new LanzaGuisantes("L", 50, 1, 3, 1);
                matrizTablero[filaM][columnaM].setNPC(LG);
                break;
            default:
                break;
        }
    }

    public void insertarZombies(String comando) {

        String arrayComando[] = comando.split(" ");
        Random rand = new Random();

        switch (arrayComando[3]) {

            case "BAJA":

        }
    }

}
