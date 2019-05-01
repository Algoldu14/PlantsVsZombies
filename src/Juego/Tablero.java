/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Alvaro
 */
public final class Tablero {

    private static int filas;
    private static int columnas;
    private static String dificultad;
    private int soles;
    private static Celda matrizTablero[][];
    private int turno;
    private boolean victoria;

    public Tablero() {
        this.columnas = columnas;
        this.filas = filas;
        this.soles = 50;
        this.matrizTablero = matrizTablero;
        this.turno = 1;
        this.dificultad = dificultad;
        this.victoria = false;
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

    public boolean getVictorio() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    public void crearTableroIni(int filas, int columnas) {

        for (int fila = 0; fila <= filas * 2; fila++) {
            if (fila % 2 == 0) {
                for (int columna = 0; columna < columnas; columna++) {
                    System.out.print("|");
                    System.out.print("--------");

                }
                System.out.println("|");
            } else {
                for (int columna = 0; columna < columnas; columna++) {
                    System.out.print("|");
                    System.out.print("        ");

                }
                System.out.println("|");
            }

        }
    }

    public void pintarTablero(int filas, int columnas) {

        for (int fila = 0; fila < this.filas * 2; fila++) {
            if (fila % 2 == 0) {
                for (int columna = 0; columna < columnas; columna++) {
                    System.out.print("|");
                    System.out.print("--------");

                }
                System.out.println("|");
            } else {
                for (int columna = 0; columna < columnas; columna++) {
                    System.out.print("|");
                    System.out.print(this.matrizTablero[(int) (fila / 2)][columna].toString());

                }
                System.out.println("|");
            }
        }
        for (int columna = 0; columna < columnas; columna++) {
            System.out.print("|");
            System.out.print("--------");

        }
        System.out.println("|");

    }

    public void actualizarTablero() {
        int turno = this.getTurno();
        Scanner entrada = new Scanner(System.in);
        while (!this.victoria && this.turno <= 30) {

            System.out.println("Introduzca el comando: ");
            String comando = entrada.nextLine();
            comando = comando.toUpperCase();
            String arrayComando[] = comando.split(" ");

            switch (arrayComando[0]) {
                case "N": //Si en el comando hay una N inicia el juego
                    this.setDificultad(arrayComando[3]);
                    this.setFilas(Integer.parseInt(arrayComando[1]));
                    this.setColumnas(Integer.parseInt(arrayComando[2]));
                    this.crearTableroIni(Integer.parseInt(arrayComando[1]), Integer.parseInt(arrayComando[2]));
                    this.setMatrizTablero(this.crearMatrizTablero(this.getFilas(), this.getColumnas()));
                    System.out.println("Tienes: " + this.getSoles() + " soles");
                    System.out.println("Turno: " + this.getTurno());
                    System.out.println("");
                    break;
                case "L": //Si son las plantas
                    this.introducirPlanta(comando);
                    this.pintarTablero(this.getFilas(), this.getColumnas());
                    System.out.print("Turno: " + this.getTurno());
                    System.out.println("");
                    break;
                case "G":
                    this.introducirPlanta(comando);
                    this.pintarTablero(this.getFilas(), this.getColumnas());
                    System.out.print("Turno: " + this.getTurno());
                    System.out.println("");
                    break;
                case "AYUDA":
                    System.out.println("Manual del Juego: ");
                    System.out.println("N <filas> <columnas> <Dificultad> para hacer un juego nuevo (Dificultad: BAJA, MEDIA, ALTA, IMPOSIBLE)");
                    System.out.println("G <fila> <columna>  para insertar un Girasol en las posiciones introducidas");
                    System.out.println("L <fila> <columna>  para insertar un lanza guisantes en las posiciones introducidas");
                    System.out.println("S para salir del juego");
                    System.out.println("<ENTER> para pasar de turno");
                    System.out.println("");
                    break;
                case "": // Si es un enter
                    this.insertarZombieAleatorio();
                    this.setTurno(turno++);
                    this.pintarTablero(this.getFilas(), this.getColumnas());
                    System.out.println("");
                    System.out.print("Turno: " + this.getTurno());
                    System.out.println("");
                    break;
                case "S":
                    System.exit(0); //Sale del programa
                    break;
                default:
                    System.out.println("Error al introducir el comando.");
                    break;
            }
        }
    }

    public Celda[][] crearMatrizTablero(int filas, int columnas) {

        matrizTablero = new Celda[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                NPC NPC = new NPC();
                Celda celda = new Celda(NPC); //metemos celdas vacías
                matrizTablero[i][j] = celda;
            }
        }
        return matrizTablero;
    }

    public void introducirPlanta(String comandoJuego) {

        String arrayComando[] = comandoJuego.split(" ");
        int filaM = Integer.parseInt(arrayComando[1]);
        int columnaM = Integer.parseInt(arrayComando[2]);

        switch (arrayComando[0]) {
            case "G":
                Girasol girasol = new Girasol("G", 20, 0, 3, 2);
                this.matrizTablero[filaM][columnaM].setNPC(girasol);
                break;
            case "L":
                LanzaGuisantes LG = new LanzaGuisantes("L", 50, 1, 3, 1);
                this.matrizTablero[filaM][columnaM].setNPC(LG);
                break;
            default:
                break;
        }
    }

    public void insertarZombieAleatorio() {

        //Random rand = new Random();

        switch (this.getDificultad()) {
            case "BAJA":
                if (this.turno >= 10) {
                    if (this.turno == 10 || this.turno == 13 || this.turno == 16
                            || this.turno == 19 || this.turno == 22) {
                        ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                        this.matrizTablero[(int)(Math.random() * this.getFilas())+1][this.getColumnas()].setNPC(zombie);
                    }
                }
                break;
            case "MEDIA":
                if (this.turno >= 7) {
                    if (this.turno == 7 || this.turno == 8 || this.turno == 9 || this.turno == 10
                            || this.turno == 12 || this.turno == 13 || this.turno == 14 || this.turno == 15
                            || this.turno == 16 || this.turno == 18 || this.turno == 19 || this.turno == 20
                            || this.turno == 22 || this.turno == 23 || this.turno == 24) {
                        ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                        this.matrizTablero[(int)(Math.random() * this.getFilas())+1][this.getColumnas()].setNPC(zombie);
                    }
                }
                break;
            case "ALTA":
                if (this.turno >= 5) {
                    if (this.turno == 5 || this.turno == 9 || this.turno == 10 || this.turno == 11
                            || this.turno == 13 || this.turno == 14 || this.turno == 20 || this.turno == 21
                            || this.turno == 22 || this.turno == 23 || this.turno == 24) {
                        for (int i = 0; i < 2; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            this.matrizTablero[(int)(Math.random() * this.getFilas())+1][this.getColumnas()].setNPC(zombie);
                        }
                    } else if (this.turno == 17) {
                        for (int i = 0; i < 3; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            this.matrizTablero[(int)(Math.random() * this.getFilas())+1][this.getColumnas()].setNPC(zombie);
                        }
                    }
                }
                break;
            case "IMPOSIBLE":
                if (this.getTurno() >= 5 && this.getTurno() < 25) {
                    if (this.turno % 2 == 0) {
                        for (int i = 0; i < 2; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            
                            this.matrizTablero[(int)(Math.random() * this.getFilas())][this.getColumnas()-1].setNPC(zombie);
                        }
                    } else {
                        for (int i = 0; i < 3; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            this.matrizTablero[(int)(Math.random() * this.getFilas())][this.getColumnas()-1].setNPC(zombie);                        }
                    }
                }
                break;
        }
    }

}
