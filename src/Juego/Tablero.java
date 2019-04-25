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

    private static int filas;
    private static int columnas;
    private static String dificultad;
    private int soles;
    private static Celda matrizTablero[][];
    private int turno;

    public Tablero() {
        Tablero.columnas = columnas;
        Tablero.filas = filas;
        this.soles = 50;
        this.matrizTablero = new Celda[filas * 2][columnas];
        this.turno = 1;
        this.dificultad = dificultad;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getSoles() {
        return soles;
    }

    public void setSoles(int soles) {
        this.soles = soles;
    }

    public Celda[][] getMatrizTablero() {
        return matrizTablero;
    }

    public void setMatrizTablero(Celda[][] matrizTablero) {
        this.matrizTablero = matrizTablero;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void crearTablero() {
        for (int i = 0; i < ((this.getMatrizTablero().length)); i++) {
            for (int j = 0; j < (this.getColumnas()); j++) {
                if (i % 2 == 0) {
                    if (j == 0) {
                        System.out.print("|-------");
                    } else {
                        System.out.print("--------");
                    }
                } else {
                    matrizTablero[i][j] = new Celda(new NPC());
                    matrizTablero[i][j].toString();
                    if (j == this.getColumnas()) {
                        System.out.println("");
                    }
                }
            }
            System.out.println("|");

        }
    }

    /*public void actualizarTablero(String comando) {

        if (this.turno <= 30) {
            comando = comando.toUpperCase();
            String arrayComando[] = comando.split(" ");
            switch (arrayComando[0]) {
                case "N": //Si en el comando hay una N inicia el juego
                    this.crearTablero();
                    // this.imprimirTablero(this.matrizTablero);
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
            this.imprimirTablero(this.matrizTablero);
        } else {
            System.out.println("Fin del juego");
        }
    }*/

 /*public Celda[][] crearTablero(int filas, int columnas) {

        matrizTablero = new Celda[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                NPC NPC = new NPC();
                Celda celda = new Celda(NPC); //metemos celdas vacías
                matrizTablero[i][j] = celda;
            }
        }
        return matrizTablero;
    }*/
    public void imprimirTablero(Celda[][] matrizTablero) {

        for (int f = 0; f < matrizTablero.length; f++) {
            for (int c = 0; c < matrizTablero[f].length; c++) {
                System.out.print(matrizTablero[f][c].toString());
            }
            System.out.println();
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

    public void insertarZombieAleatorio(String comando) {

        String arrayComando[] = comando.split(" ");
        Random rand = new Random();

        switch (arrayComando[3]) {
            case "BAJA":
                if (this.turno >= 10) {
                    if (this.turno == 10 || this.turno == 13 || this.turno == 16
                            || this.turno == 19 || this.turno == 22) {
                        ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                        matrizTablero[1 + (rand.nextInt() * matrizTablero.length)][matrizTablero.length].setNPC(zombie);
                    }
                }
            case "MEDIA":
                if (this.turno >= 7) {
                    if (this.turno == 7 || this.turno == 8 || this.turno == 9 || this.turno == 10
                            || this.turno == 12 || this.turno == 13 || this.turno == 14 || this.turno == 15
                            || this.turno == 16 || this.turno == 18 || this.turno == 19 || this.turno == 20
                            || this.turno == 22 || this.turno == 23 || this.turno == 24) {
                        ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                        matrizTablero[1 + (rand.nextInt() * matrizTablero.length)][matrizTablero.length].setNPC(zombie);
                    }
                }
            case "ALTA":
                if (this.turno >= 5) {
                    if (this.turno == 5 || this.turno == 9 || this.turno == 10 || this.turno == 11
                            || this.turno == 13 || this.turno == 14 || this.turno == 20 || this.turno == 21
                            || this.turno == 22 || this.turno == 23 || this.turno == 24) {
                        for (int i = 0; i < 2; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            matrizTablero[1 + (rand.nextInt() * matrizTablero.length)][matrizTablero.length].setNPC(zombie);
                        }
                    } else if (this.turno == 17) {
                        for (int i = 0; i < 3; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            matrizTablero[1 + (rand.nextInt() * matrizTablero.length)][matrizTablero.length].setNPC(zombie);
                        }
                    }
                }
            case "IMPOSIBLE":
                if (this.turno >= 5 || this.turno < 25) {
                    if (this.turno % 2 == 0) {
                        for (int i = 0; i < 2; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            matrizTablero[1 + (rand.nextInt() * matrizTablero.length)][matrizTablero.length].setNPC(zombie);
                        }
                    } else {
                        for (int i = 0; i < 3; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            matrizTablero[1 + (rand.nextInt() * matrizTablero.length)][matrizTablero.length].setNPC(zombie);
                        }
                    }
                }
        }
    }

}
