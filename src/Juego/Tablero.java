/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Excepciones.ExcepcionJuego;
import Excepciones.ExcepcionPlanta;
import java.util.Scanner;

/**
 *
 * @author Alvaro y Patricia
 */

/*
Esta clase es la clase principal del programa, en ella se controla todas las acciones del tablero al 
igual que la actualizacion del mismo, aqui se encuantra la interfaz del juego tambien
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
        this.turno = 0;
        this.dificultad = dificultad;
        this.victoria = victoria;
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

    public boolean getVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }

    /*
    El metodo de crearMatrizTablero es el que crea la matriz donde se guardan los NPCs, inicialmente
    la matriz esta compuesta de Celdas que contienen NPCs vacios.
     */
    public Celda[][] crearMatrizTablero(int filas, int columnas) {

        matrizTablero = new Celda[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Celda celda = new Celda(new NPC()); //metemos celdas vacías
                matrizTablero[i][j] = celda;
            }
        }
        return matrizTablero;
    }

    /*
    Este metodo pinta el tablero solicitado por el comando N <filas> <columnas> <Dificultad>.
     */
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

    /*
    El metodo actualizarTablero es el metodo mas importante de esta clase y del programa, en este metodo se analiza
    el comando introducido y determina lo que tiene que ir haciendo. Al igual que va pidiendo la introduccion de los 
    nuevos comandos y tratados con sus excepciones.
     */
    public void actualizarTablero() throws ExcepcionPlanta, ExcepcionJuego {

        Scanner entrada = new Scanner(System.in);

        while (this.turno < 30) {
            try {
                System.out.println("Introduzca el comando: ");
                String comando = entrada.nextLine();
                comando = comando.toUpperCase();
                String arrayComando[] = comando.split(" ");
                //if (!(comando.isEmpty())) {
                //  throw new ExcepcionJuego(comando);
                //}
                switch (arrayComando[0]) {
                    case "N": //Si en el comando hay una N inicia el juego
                        this.setDificultad(arrayComando[3]);
                        this.setFilas(Integer.parseInt(arrayComando[1]));
                        this.setColumnas(Integer.parseInt(arrayComando[2]));
                        this.setMatrizTablero(this.crearMatrizTablero(this.getFilas(), this.getColumnas()));
                        this.pintarTablero(this.filas, this.columnas);
                        System.out.println("Tienes: " + this.getSoles() + " soles");
                        System.out.println("Turno: " + this.getTurno());
                        System.out.println("");
                        break;
                    case "L": //Si son las plantas
                        if (this.soles < 50) {
                            throw new ExcepcionPlanta(this.soles - 50);
                        } else {
                            this.introducirPlanta(comando);
                            
                        }
                        this.pintarTablero(this.getFilas(), this.getColumnas());
                        System.out.println("Turno: " + this.getTurno());
                        System.out.println("Tienes: " + this.getSoles() + " soles");
                        System.out.println("");
                        break;
                    case "G":
                        if (this.soles < 20) {
                            throw new ExcepcionPlanta(this.soles - 20);
                        } else {
                            this.introducirPlanta(comando);
                            
                        }
                        this.pintarTablero(this.getFilas(), this.getColumnas());
                        System.out.println("Turno: " + this.getTurno());
                        System.out.println("Tienes: " + this.getSoles() + " soles");
                        System.out.println("");
                        break;
                    case "AYUDA":
                        System.out.println("Manual del Juego: ");
                        System.out.println("N <filas> <columnas> <Dificultad> para hacer un juego nuevo (Dificultad: BAJA, MEDIA, ALTA, IMPOSIBLE).");
                        System.out.println("G <fila> <columna>  para insertar un Girasol en las posiciones introducidas.");
                        System.out.println("L <fila> <columna>  para insertar un lanza guisantes en las posiciones introducidas.");
                        System.out.println("S para salir del juego.");
                        System.out.println("<ENTER> para pasar de turno.");
                        System.out.println("");
                        break;
                    case "": // Si es un enter
                        this.sumarGirasoles(); //Se suman los soles cada dos turnos
                        this.ataquePlanta();  //Las plantas atacan
                        this.ataqueZombie(); //Los zombies atacan
                        this.moverZombie(); //Los zombies se mueven
                        this.insertarZombieAleatorio(); //Metemos zombies nuevos
                        this.limpiarTablero(); //Limpiamos el tablero
                        this.setTurno(this.turno + 1); //Aumentamos el turno
                        this.pintarTablero(this.getFilas(), this.getColumnas());
                        System.out.println("");
                        System.out.println("Turno: " + this.getTurno());
                        System.out.println("Tienes: " + this.getSoles() + " soles");
                        System.out.println("");
                        break;
                    case "S":
                        System.exit(0); //Sale del programa
                        break;
                    default:
                        System.out.println("Error al introducir el comando.");
                        break;
                }
            } catch (ExcepcionPlanta ep) {
                System.out.println(ep.getMessage());
                System.out.println("");
            }
            /*
            catch (ExcepcionJuego ej) {
                System.out.println(ej.getMessage());
                System.out.println("");
            }
             */
        }
    }

    /*
    Metodo usado para introducir la planta en la posicion indicada en el comando, comprobando si la posicion introducida
    es correcta o si la planta existe
     */
    public void introducirPlanta(String comandoJuego) {

        String arrayComando[] = comandoJuego.split(" ");
        int filaM = Integer.parseInt(arrayComando[1]);
        int columnaM = Integer.parseInt(arrayComando[2]);

        if (filaM <= this.filas && columnaM <= this.columnas && filaM >= 0 && columnaM >= 0) {
            switch (arrayComando[0]) {
                case "G":
                    if (this.matrizTablero[filaM][columnaM].getNPC() instanceof ZombieComun
                            || this.matrizTablero[filaM][columnaM].getNPC() instanceof LanzaGuisantes
                            || this.matrizTablero[filaM][columnaM].getNPC() instanceof Girasol) {
                        System.out.println("No puedes introducir un girasol en esa posición.");
                        System.out.println("");
                        break;
                    } else {
                        Girasol girasol = new Girasol("G", 20, 0, 3, 2);
                        this.matrizTablero[filaM][columnaM].setNPC(girasol);
                        this.setSoles(this.soles - 20);
                        break;
                    }
                case "L":
                    if (this.matrizTablero[filaM][columnaM].getNPC() instanceof ZombieComun
                            || this.matrizTablero[filaM][columnaM].getNPC() instanceof LanzaGuisantes
                            || this.matrizTablero[filaM][columnaM].getNPC() instanceof Girasol) {
                        System.out.println("No puedes introducir un lanza guisantes en esa posición.");
                        System.out.println("");
                        break;
                    } else {
                        LanzaGuisantes LG = new LanzaGuisantes("L", 50, 1, 3, 1);
                        this.matrizTablero[filaM][columnaM].setNPC(LG);
                        this.setSoles(this.soles - 50);
                        break;
                    }
                default:
                    System.out.println("No existe esa planta.");
                    System.out.println("");
                    break;
            }
        } else {
            System.out.println("No existe esa posición.");
            System.out.println("");
        }
    }

    /*
    Metodo usado para que los zombies vayan entrando en el tablero de una forma concreta que hemos determinado en la
    ultima columna del tablero
     */
    public void insertarZombieAleatorio() {

        switch (this.getDificultad()) {
            case "BAJA":
                if (this.turno >= 10) {
                    if (this.turno == 10 || this.turno == 13 || this.turno == 16
                            || this.turno == 19 || this.turno == 22) {
                        ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                        this.matrizTablero[(int) (Math.random() * this.getFilas())][this.getColumnas() - 1].setNPC(zombie);
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
                        this.matrizTablero[(int) (Math.random() * this.getFilas())][this.getColumnas() - 1].setNPC(zombie);
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
                            this.matrizTablero[(int) (Math.random() * this.getFilas())][this.getColumnas() - 1].setNPC(zombie);
                        }
                    } else if (this.turno == 17) {
                        for (int i = 0; i < 3; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            this.matrizTablero[(int) (Math.random() * this.getFilas())][this.getColumnas() - 1].setNPC(zombie);
                        }
                    }
                }
                break;
            case "IMPOSIBLE":
                if (this.getTurno() >= 5 && this.getTurno() < 25) {
                    if (this.turno % 2 == 0) {
                        for (int i = 0; i < 2; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);

                            this.matrizTablero[(int) (Math.random() * this.getFilas())][this.getColumnas() - 1].setNPC(zombie);
                        }
                    } else {
                        for (int i = 0; i < 3; i++) {
                            ZombieComun zombie = new ZombieComun("Z", 1, 5, 2);
                            this.matrizTablero[(int) (Math.random() * this.getFilas())][this.getColumnas() - 1].setNPC(zombie);
                        }
                    }
                }
                break;
            default:
                System.out.println("Dificultad mal introducida");
        }
    }

    /*
    En este metodo hacemos que los zombies avancen por el tablero hacia alante, si hay un zombie delante el zombie no 
    se movera hasta que tenga la siguiente casilla libre
     */
    public void moverZombie() {
        try {

            NPC NPC = new NPC();
            for (int i = 0; i < this.filas; i++) { //bajar frecuencia a los zombies
                for (int j = 0; j < this.columnas; j++) {
                    if (this.matrizTablero[i][j].getNPC() instanceof ZombieComun) {
                        if (this.matrizTablero[i][j].getNPC().getFrecuencia() == 0) { //Si el zombie se puede mover
                            if (this.matrizTablero[i][j - 1].getNPC() instanceof ZombieComun && j >= 1) { //Si hay un zombie delante
                                this.matrizTablero[i][j].getNPC().setFrecuencia(1); //Le ponemos la frecuencia a uno para que no avance
                            } else {
                                NPC = this.matrizTablero[i][j].getNPC(); //en el NPC vacío metemos el que tiene la frecuencia a 0 para moverlo
                                this.matrizTablero[i][j].setNPC(new NPC()); //en la posición original metemos un NPC vacío
                                this.matrizTablero[i][j - 1].setNPC(NPC); //metemos el NPC en la siguiente casilla
                                this.matrizTablero[i][j - 1].getNPC().setFrecuencia(2); //reseteamos la frecuencia del NPC
                            }
                        } else { //Si no se puede mover
                            this.matrizTablero[i][j].getNPC().setFrecuencia(this.matrizTablero[i][j].getNPC().getFrecuencia() - 1); //le restamos 1 a la frecuencia del NPC
                        }
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Has perdido, los zombies han llegado a tu casa.");
            System.exit(0);
        }
    }

    /*
    Metodo para sumar los girasoles que generan las plantas Girasol contando en el turno que se han introducido
     */
    public void sumarGirasoles() {

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.matrizTablero[i][j].getNPC() instanceof Girasol) {
                    if (this.matrizTablero[i][j].getNPC().getFrecuencia() > 0) { //Si tiene la frecuencia mayor que cero
                        this.matrizTablero[i][j].getNPC().setFrecuencia(this.matrizTablero[i][j].getNPC().getFrecuencia() - 1);
                    } else {
                        this.setSoles(this.soles + 10); //Si la frecuencia del girasol es 0 suma 10 soles
                        this.matrizTablero[i][j].getNPC().setFrecuencia(2);
                    }
                }
            }
        }
    }

    public void ataquePlanta() {

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.matrizTablero[i][j].getNPC() instanceof LanzaGuisantes && this.matrizTablero[i][j].getNPC().getFrecuencia() > 0) { //Si hay un LanzaGuisantes y puede atacar
                    for (int columna = j + 1; columna < this.columnas; columna++) { //Recorremos la fila en la que se encuentra
                        if (this.matrizTablero[i][columna].getNPC() instanceof ZombieComun && this.matrizTablero[i][columna].getNPC().getResistencia() != 0) { //Si es un zombie con vida
                            this.matrizTablero[i][columna].getNPC().setResistencia(this.matrizTablero[i][columna].getNPC().getResistencia() - 1);//Le quitamos vida al zombie
                            this.matrizTablero[i][j].getNPC().setFrecuencia(0);//le negamos a la palnta que dispare mas
                            break; //Rompemos el for para que no ataque mas en ese turno

                        }
                    }
                    this.matrizTablero[i][j].getNPC().setFrecuencia(1);//Reseteamos la posibilidad de ataque de la planta para el siguiente turno
                }
            }
        }
    }

    public void ataqueZombie() {

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.matrizTablero[i][j].getNPC() instanceof ZombieComun && j >= 1) { //Si hay un zombie y puede atacar
                    if (this.matrizTablero[i][j - 1].getNPC() instanceof LanzaGuisantes
                            || this.matrizTablero[i][j - 1].getNPC() instanceof Girasol) { //Si en la casilla aneterior hay alguna planta
                        if (this.matrizTablero[i][j - 1].getNPC().getResistencia() != 0) { //Si tiene vida
                            this.matrizTablero[i][j - 1].getNPC().setResistencia(this.matrizTablero[i][j - 1].getNPC().getResistencia() - 1); //Le bajamos la resitencia
                            this.matrizTablero[i][j].getNPC().setFrecuencia(2); //Reseteamos la frecuencia del zombie para que no se mueva

                        }
                    }
                }
            }
        }
    }

    public void limpiarTablero() {
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.matrizTablero[i][j].getNPC().getResistencia()<=0) { //Si el NP que haya en esa casilla no tiene vida
                    this.matrizTablero[i][j].setNPC(new NPC());
                    }
                }
            }
        }
    }

