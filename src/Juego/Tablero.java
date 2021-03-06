/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Excepciones.ExcepcionJuego;
import Excepciones.ExcepcionPlanta;
import java.util.Random;

/**
 *
 * @author Alvaro y Patricia
 */

/*
La clase Tablero es la clase principal del programa, en ella se controla todas las acciones del tablero al 
igual que la actualizacion del mismo, aqui se encuantra la interfaz del juego tambien
 */
public final class Tablero {

    private static int filas;
    private static int columnas;
    private static String dificultad;
    private int soles;
    private static Celda matrizTablero[][];
    private int turno;
    private int contadorZombies;
    private boolean victoria;

    public Tablero() {
        this.columnas = 8;
        this.filas = 7;
        this.soles = 50;
        this.matrizTablero = matrizTablero;
        this.turno = 0;
        this.dificultad = dificultad;
        this.contadorZombies = contadorZombies;
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

    public int getContadorZombies() {
        return contadorZombies;
    }

    public void setContadorZombies(int contadorZombies) {
        this.contadorZombies = contadorZombies;
    }

    public boolean isVictoria() {
        return victoria;
    }

    public void setVictoria(boolean victoria) {
        this.victoria = victoria;
    }


    /*
    El metodo de crearMatrizTablero es el que crea la matriz donde se guardan los NPCs, inicialmente
    la matriz esta compuesta de Celdas que contienen NPCs vacios.
     */
    public Celda[][] crearMatrizTablero() {

        matrizTablero = new Celda[this.filas][this.columnas];

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                Celda celda = new Celda(new NPC()); //metemos celdas vacías
                matrizTablero[i][j] = celda;
            }
        }
        return matrizTablero;
    }

    /*
    El metodo actualizarTablero es el metodo mas importante de esta clase y del programa, en este metodo se analiza
    el comando introducido y determina lo que tiene que ir haciendo. Al igual que va pidiendo la introduccion de los 
    nuevos comandos y tratados con sus excepciones.
     */
    public void actualizarTablero(String comando) throws ExcepcionPlanta, ExcepcionJuego {

        comando = comando.toUpperCase();
        String arrayComando[] = comando.split(" ");
        try {
            if (!(this.comprobarComando(comando))) {
                if (!(this.comprobarPosicionMatriz(comando))) {
                    switch (arrayComando[0]) {
                        case "L": //Si son las plantas
                            if (this.soles < 50) {
                                throw new ExcepcionPlanta(ExcepcionPlanta.INSUFICIENTES_SOLES);
                            } else {
                                this.introducirPlanta(comando);
                            }
                            break;
                        case "G":
                            if (this.soles < 20) {
                                throw new ExcepcionPlanta(ExcepcionPlanta.INSUFICIENTES_SOLES);
                            } else {
                                this.introducirPlanta(comando);
                            }
                        case "B":
                            if (this.soles < 200) {
                                throw new ExcepcionPlanta(ExcepcionPlanta.INSUFICIENTES_SOLES);
                            } else {
                                this.meterBomba(comando);
                            }
                            break;
                        case "N":
                            if (this.soles < 50) {
                                throw new ExcepcionPlanta(ExcepcionPlanta.INSUFICIENTES_SOLES);
                            } else {
                                this.introducirPlanta(comando);
                            }
                            break;
                        case "P":
                            if (this.soles < 50) {
                                throw new ExcepcionPlanta(ExcepcionPlanta.INSUFICIENTES_SOLES);
                            } else {
                                this.introducirPlanta(comando);
                            }
                            break;
                        default:

                            break;
                    }
                } else {
                    throw new ExcepcionJuego(ExcepcionJuego.NO_EXISTE_POSICION);
                }
            } else {
                throw new ExcepcionJuego(ExcepcionJuego.ERROR_COMANDO);
            }
        } catch (Exception e) {

        }
    }

    /*
    El metodo introducirPlanta es usado para introducir la planta en la posicion indicada en el comando, comprobando si la posicion introducida
    es correcta o si la planta existe.
     */
    public void introducirPlanta(String comandoJuego) throws ExcepcionPlanta {

        String arrayComando[] = comandoJuego.split(" ");
        int filaM = Integer.parseInt(arrayComando[1]);
        int columnaM = Integer.parseInt(arrayComando[2]);

        try {
            if (filaM <= this.filas && columnaM <= this.columnas && filaM >= 0 && columnaM >= 0) {
                switch (arrayComando[0]) {
                    case "G":
                        if (this.matrizTablero[filaM][columnaM].getNPC() instanceof ZombieComun
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof LanzaGuisantes
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Girasol
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Petacereza
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Nuez
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Deportista
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Caracubo) {
                            throw new ExcepcionPlanta(ExcepcionPlanta.POSICION_OCUPADA);
                        } else {
                            Girasol girasol = new Girasol("G", 20, 0, 3, 2);
                            this.matrizTablero[filaM][columnaM].setNPC(girasol);
                            this.setSoles(this.soles - 20);
                            break;
                        }
                    case "L":
                        if (this.matrizTablero[filaM][columnaM].getNPC() instanceof ZombieComun
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof LanzaGuisantes
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Girasol
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Petacereza
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Nuez
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Deportista
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Caracubo) {
                            throw new ExcepcionPlanta(ExcepcionPlanta.POSICION_OCUPADA);
                        } else {
                            LanzaGuisantes LG = new LanzaGuisantes("L", 50, 1, 3, 1);
                            this.matrizTablero[filaM][columnaM].setNPC(LG);
                            this.setSoles(this.soles - 50);
                            break;
                        }
                    case "P":
                        if (this.matrizTablero[filaM][columnaM].getNPC() instanceof ZombieComun
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof LanzaGuisantes
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Girasol
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Petacereza
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Nuez
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Deportista
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Caracubo) {
                            throw new ExcepcionPlanta(ExcepcionPlanta.POSICION_OCUPADA);
                        } else {
                            Petacereza PZ = new Petacereza("P", 10, 2, 2, 50);
                            this.matrizTablero[filaM][columnaM].setNPC(PZ);
                            this.setSoles(this.soles - 50);
                            break;
                        }
                    case "N":
                        if (this.matrizTablero[filaM][columnaM].getNPC() instanceof ZombieComun
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof LanzaGuisantes
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Girasol
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Petacereza
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Nuez
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Deportista
                                || this.matrizTablero[filaM][columnaM].getNPC() instanceof Caracubo) {
                            throw new ExcepcionPlanta(ExcepcionPlanta.POSICION_OCUPADA);
                        } else {
                            Nuez NZ = new Nuez("N", 0, 10, 0, 50);
                            this.matrizTablero[filaM][columnaM].setNPC(NZ);
                            this.setSoles(this.soles - 50);
                            break;
                        }
                    default:

                        break;
                }
            }
        } catch (ExcepcionPlanta ep) {

        }
    }

    /*
    El metodo insertarZombieAleatorio es usado para que los zombies vayan entrando en el tablero de una forma concreta que hemos determinado en la
    ultima columna del tablero.
     */
    public void insertarZombieAleatorio() {

        Random rand = new Random();
        if (this.contadorZombies != 0) {

            switch (this.getDificultad()) {
                case "BAJA":
                    if (this.turno >= 10) {
                        int aleatorio = rand.nextInt(2);
                        if (aleatorio == 1) {
                            int filaAleatoria = rand.nextInt(this.filas);
                            if (!(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof ZombieComun)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Deportista)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Caracubo)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Girasol)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof LanzaGuisantes)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Petacereza)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Nuez)) {
                                int zandom = rand.nextInt(3);
                                if (zandom == 0) {
                                    ZombieComun zombieC = new ZombieComun("Z", 1, 5, 1);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieC);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                } else if (zandom == 1) {
                                    Caracubo zombieCa = new Caracubo("C", 1, 8, 3);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieCa);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                } else {
                                    Deportista zombieD = new Deportista("D", 1, 2, 0);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieD);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                }
                            }
                        }
                    }
                    break;
                case "MEDIA":
                    if (this.turno >= 7) {
                        if (this.turno % 2 == 0) {
                            for (int i = 0; i < 2; i++) {
                                int filaAleatoria = rand.nextInt(this.filas);
                                if (!(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof ZombieComun)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Deportista)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Caracubo)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Girasol)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof LanzaGuisantes)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Petacereza)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Nuez)) {
                                    int zandom = rand.nextInt(3);
                                    if (zandom == 0) {
                                        ZombieComun zombieC = new ZombieComun("Z", 1, 5, 1);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieC);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else if (zandom == 1) {
                                        Caracubo zombieCa = new Caracubo("C", 1, 8, 3);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieCa);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else {
                                        Deportista zombieD = new Deportista("D", 1, 2, 0);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieD);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    }
                                }
                            }
                        } else {
                            int filaAleatoria = rand.nextInt(this.filas);
                            if (!(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof ZombieComun)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Deportista)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Caracubo)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Girasol)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof LanzaGuisantes)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Petacereza)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Nuez)) {
                                int zandom = rand.nextInt(3);
                                if (zandom == 0) {
                                    ZombieComun zombieC = new ZombieComun("Z", 1, 5, 1);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieC);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                } else if (zandom == 1) {
                                    Caracubo zombieCa = new Caracubo("C", 1, 8, 3);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieCa);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                } else {
                                    Deportista zombieD = new Deportista("D", 1, 2, 0);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieD);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                }
                            }
                        }
                    }
                    break;
                case "ALTA":
                    if (this.turno >= 5) {
                        if (this.turno % 2 == 0) {
                            for (int i = 0; i < 2; i++) {
                                int filaAleatoria = rand.nextInt(this.filas);
                                if (!(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof ZombieComun)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Deportista)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Caracubo)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Girasol)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof LanzaGuisantes)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Petacereza)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Nuez)) {
                                    int zandom = rand.nextInt(3);
                                    if (zandom == 0) {
                                        ZombieComun zombieC = new ZombieComun("Z", 1, 5, 1);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieC);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else if (zandom == 1) {
                                        Caracubo zombieCa = new Caracubo("C", 1, 8, 3);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieCa);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else {
                                        Deportista zombieD = new Deportista("D", 1, 2, 0);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieD);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    }
                                }
                            }
                        } else {
                            int filaAleatoria = rand.nextInt(this.filas);
                            if (!(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof ZombieComun)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Deportista)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Caracubo)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Girasol)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof LanzaGuisantes)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Petacereza)
                                    || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Nuez)) {
                                int zandom = rand.nextInt(3);
                                if (zandom == 0) {
                                    ZombieComun zombieC = new ZombieComun("Z", 1, 5, 1);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieC);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                } else if (zandom == 1) {
                                    Caracubo zombieCa = new Caracubo("C", 1, 8, 3);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieCa);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                } else {
                                    Deportista zombieD = new Deportista("D", 1, 2, 0);
                                    this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieD);
                                    this.setContadorZombies(this.contadorZombies - 1);
                                }
                            }
                        }
                    }
                    break;
                case "IMPOSIBLE":
                    if (this.turno >= 5) {
                        if (this.turno % 2 == 0) {
                            for (int i = 0; i < 3; i++) {
                                int filaAleatoria = rand.nextInt(this.filas);
                                if (!(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof ZombieComun)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Deportista)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Caracubo)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Girasol)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof LanzaGuisantes)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Petacereza)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Nuez)) {
                                    int zandom = rand.nextInt(3);
                                    if (zandom == 0) {
                                        ZombieComun zombieC = new ZombieComun("Z", 1, 5, 1);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieC);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else if (zandom == 1) {
                                        Caracubo zombieCa = new Caracubo("C", 1, 8, 3);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieCa);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else {
                                        Deportista zombieD = new Deportista("D", 1, 2, 0);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieD);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    }
                                }
                            }
                        } else {
                            for (int i = 0; i < 2; i++) {
                                int filaAleatoria = rand.nextInt(this.filas);
                                if (!(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof ZombieComun)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Deportista)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Caracubo)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Girasol)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof LanzaGuisantes)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Petacereza)
                                        || !(this.matrizTablero[filaAleatoria][this.columnas - 1].getNPC() instanceof Nuez)) {
                                    int zandom = rand.nextInt(3);
                                    if (zandom == 0) {
                                        ZombieComun zombieC = new ZombieComun("Z", 1, 5, 1);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieC);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else if (zandom == 1) {
                                        Caracubo zombieCa = new Caracubo("C", 1, 8, 3);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieCa);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    } else {
                                        Deportista zombieD = new Deportista("D", 1, 2, 0);
                                        this.matrizTablero[filaAleatoria][this.columnas - 1].setNPC(zombieD);
                                        this.setContadorZombies(this.contadorZombies - 1);
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }

    /*
    El metodo moverZombie hace que los zombies avancen por el tablero hacia alante, si hay un zombie delante el zombie no 
    se movera hasta que tenga la siguiente casilla libre.
     */
    public void moverZombie() {
        try {
            NPC NPC = new NPC();
            for (int i = 0; i < this.filas; i++) { //bajar frecuencia a los zombies
                for (int j = 0; j < this.columnas; j++) {
                    if (this.matrizTablero[i][j].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i][j].getNPC() instanceof Caracubo
                            || this.matrizTablero[i][j].getNPC() instanceof Deportista) {
                        if (this.matrizTablero[i][j].getNPC().getFrecuencia() == 0) { //Si el zombie se puede mover
                            if ((this.matrizTablero[i][j - 1].getNPC() instanceof ZombieComun
                                    || this.matrizTablero[i][j - 1].getNPC() instanceof Caracubo
                                    || this.matrizTablero[i][j - 1].getNPC() instanceof Deportista) && j >= 1) { //Si hay un zombie delante
                                this.matrizTablero[i][j].getNPC().setFrecuencia(1); //Le ponemos la frecuencia a uno para que no avance
                            } else {
                                NPC = this.matrizTablero[i][j].getNPC(); //en el NPC vacío metemos el que tiene la frecuencia a 0 para moverlo
                                this.matrizTablero[i][j].setNPC(new NPC()); //en la posición original metemos un NPC vacío
                                this.matrizTablero[i][j - 1].setNPC(NPC); //metemos el NPC en la siguiente casilla
                                if (this.matrizTablero[i][j - 1].getNPC() instanceof ZombieComun) {
                                    this.matrizTablero[i][j - 1].getNPC().setFrecuencia(1); //reseteamos la frecuencia del NPC
                                } else if (this.matrizTablero[i][j - 1].getNPC() instanceof Caracubo) {
                                    this.matrizTablero[i][j - 1].getNPC().setFrecuencia(3); //reseteamos la frecuencia del NPC
                                } else if (this.matrizTablero[i][j - 1].getNPC() instanceof Deportista) {
                                    this.matrizTablero[i][j - 1].getNPC().setFrecuencia(0);//Si es el deportista
                                }
                            }
                        } else { //Si no se puede mover
                            this.matrizTablero[i][j].getNPC().setFrecuencia(this.matrizTablero[i][j].getNPC().getFrecuencia() - 1); //le restamos 1 a la frecuencia del NPC
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
    }

    /*
    El metodo sumarGirasoles es usado para sumar los girasoles que generan las plantas Girasol contando en el turno que se han introducido.
     */
    public void sumarGirasoles() {

        if (this.turno % 2 == 0) {
            this.setSoles(this.soles + 10);
        }
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

    /*
    El metodo ataquePlanta es usado para que los lanza guisantes ataquen al primer zombie que haya en la misma fila.
     */
    public void ataquePlanta() {

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.matrizTablero[i][j].getNPC() instanceof LanzaGuisantes && this.matrizTablero[i][j].getNPC().getFrecuencia() == 1) { //Si hay un LanzaGuisantes y puede atacar
                    for (int columna = j + 1; columna < this.columnas; columna++) { //Recorremos la fila en la que se encuentra
                        if ((this.matrizTablero[i][columna].getNPC() instanceof ZombieComun
                                || this.matrizTablero[i][columna].getNPC() instanceof Caracubo
                                || this.matrizTablero[i][columna].getNPC() instanceof Deportista)
                                && this.matrizTablero[i][columna].getNPC().getResistencia() != 0
                                && this.matrizTablero[i][j].getNPC().getFrecuencia() == 1) { //Si es un zombie con vida y la planta puede atacar
                            this.matrizTablero[i][columna].getNPC().setResistencia(this.matrizTablero[i][columna].getNPC().getResistencia() - 1);//Le quitamos vida al zombie
                            this.matrizTablero[i][j].getNPC().setFrecuencia(0);//le negamos a la planta que dispare mas
                        }
                    }
                    this.matrizTablero[i][j].getNPC().setFrecuencia(1);//Reseteamos la posibilidad de ataque de la planta para el siguiente turno
                }

                if (this.matrizTablero[i][j].getNPC() instanceof Petacereza && this.matrizTablero[i][j].getNPC().getFrecuencia() == 0) {
                    if (this.matrizTablero[i - 1][j - 1].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i - 1][j - 1].getNPC() instanceof Deportista
                            || this.matrizTablero[i - 1][j - 1].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i - 1][j - 1].setNPC(new NPC());
                    }
                    if (this.matrizTablero[i - 1][j].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i - 1][j].getNPC() instanceof Deportista
                            || this.matrizTablero[i - 1][j].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i - 1][j].setNPC(new NPC());
                    }
                    if (this.matrizTablero[i - 1][j + 1].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i - 1][j + 1].getNPC() instanceof Deportista
                            || this.matrizTablero[i - 1][j + 1].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i - 1][j + 1].setNPC(new NPC());
                    }
                    if (this.matrizTablero[i][j - 1].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i][j - 1].getNPC() instanceof Deportista
                            || this.matrizTablero[i][j - 1].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i][j - 1].setNPC(new NPC());
                    }
                    if (this.matrizTablero[i][j + 1].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i][j + 1].getNPC() instanceof Deportista
                            || this.matrizTablero[i][j + 1].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i][j + 1].setNPC(new NPC());
                    }
                    if (this.matrizTablero[i + 1][j - 1].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i + 1][j - 1].getNPC() instanceof Deportista
                            || this.matrizTablero[i + 1][j - 1].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i + 1][j - 1].setNPC(new NPC());
                    }
                    if (this.matrizTablero[i + 1][j].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i + 1][j].getNPC() instanceof Deportista
                            || this.matrizTablero[i + 1][j].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i + 1][j].setNPC(new NPC());
                    }
                    if (this.matrizTablero[i + 1][j + 1].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i + 1][j + 1].getNPC() instanceof Deportista
                            || this.matrizTablero[i + 1][j + 1].getNPC() instanceof Caracubo) {
                        this.matrizTablero[i + 1][j + 1].setNPC(new NPC());
                    }
                    this.matrizTablero[i][j].setNPC(new NPC());
                } else if (this.matrizTablero[i][j].getNPC() instanceof Petacereza && this.matrizTablero[i][j].getNPC().getFrecuencia() > 0) {
                    this.matrizTablero[i][j].getNPC().setFrecuencia(this.matrizTablero[i][j].getNPC().getFrecuencia() - 1);
                }
            }
        }
    }

    /*
    El metodo ataqueZombie es usado para que los zombies ataquen a la planta que haya en la siguiente celda.
     */
    public void ataqueZombie() {

        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if ((this.matrizTablero[i][j].getNPC() instanceof ZombieComun
                        || this.matrizTablero[i][j].getNPC() instanceof Caracubo
                        || this.matrizTablero[i][j].getNPC() instanceof Deportista) && j >= 1) { //Si hay un zombie y puede atacar
                    if (this.matrizTablero[i][j - 1].getNPC() instanceof LanzaGuisantes
                            || this.matrizTablero[i][j - 1].getNPC() instanceof Girasol
                            || this.matrizTablero[i][j - 1].getNPC() instanceof Nuez
                            || this.matrizTablero[i][j - 1].getNPC() instanceof Petacereza) { //Si en la casilla aneterior hay alguna planta
                        if (this.matrizTablero[i][j - 1].getNPC().getResistencia() != 0) { //Si tiene vida
                            this.matrizTablero[i][j - 1].getNPC().setResistencia(this.matrizTablero[i][j - 1].getNPC().getResistencia() - 1); //Le bajamos la resitencia
                            this.matrizTablero[i][j].getNPC().setFrecuencia(1); //Reseteamos la frecuencia del zombie para que no se mueva

                        }
                    }
                }
            }
        }
    }

    /*
    El metodo limpiarTablero es usado para eliminar los NPCs que tienen la resistencia a 0.
     */
    public void limpiarTablero() {
        for (int i = 0; i < this.filas; i++) {
            for (int j = 0; j < this.columnas; j++) {
                if (this.matrizTablero[i][j].getNPC().getResistencia() <= 0) { //Si el NP que haya en esa casilla no tiene vida
                    this.matrizTablero[i][j].setNPC(new NPC());
                }
            }
        }
    }

    /*
    El metodo comprobarVictoria recorre la matriz en busca de zombies. Si no hay ningun zombie 
    y si no hay que meter más zombies te da la victoria.
     */
    public void comprobarVictoria() {
        int zombiesRestantesT = 0;
        if (this.contadorZombies == 0) {
            for (int i = 0; i < this.filas; i++) {
                for (int j = 0; j < this.columnas; j++) {
                    if (this.matrizTablero[i][j].getNPC() instanceof ZombieComun
                            || this.matrizTablero[i][j].getNPC() instanceof Caracubo
                            || this.matrizTablero[i][j].getNPC() instanceof Deportista) {
                        zombiesRestantesT += 1;
                    }
                }
            }
            if (zombiesRestantesT == 0) {
                this.setVictoria(true);
            }
        }

    }

    /*
    El método meterBomba es una función que se pidio en la defensa de la práctica anterior y no pareció correcto dejarlo.
    */
    public void meterBomba(String comandoJuego) {

        String arrayComando[] = comandoJuego.split(" ");
        int filaM = Integer.parseInt(arrayComando[1]);
        int columnaM = Integer.parseInt(arrayComando[2]);

        if (filaM <= this.filas && columnaM <= this.columnas && filaM >= 0 && columnaM >= 0) { //SI has metido bien el comando
            if (this.matrizTablero[filaM][columnaM].getNPC() instanceof ZombieComun
                    || this.matrizTablero[filaM][columnaM].getNPC() instanceof LanzaGuisantes
                    || this.matrizTablero[filaM][columnaM].getNPC() instanceof Girasol
                    || this.matrizTablero[filaM][columnaM].getNPC() instanceof Petacereza
                    || this.matrizTablero[filaM][columnaM].getNPC() instanceof Nuez
                    || this.matrizTablero[filaM][columnaM].getNPC() instanceof Deportista
                    || this.matrizTablero[filaM][columnaM].getNPC() instanceof Caracubo) {
                this.matrizTablero[filaM][columnaM].setNPC(new NPC());
                this.setSoles(this.getSoles() - 200);
            }
        }
    }
    
    /*
    El método esNumerico comprueba si la cadena introducida son o no números.
    */
    public static boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    /*
    El método comprobarComando comprueba si el comando introducido es correcto.
    */
    public boolean comprobarComando(String comando) { //no funciona xd

        String arrayComando[] = comando.split(" ");
        boolean comandoMal = false;

        switch (arrayComando[0]) {
            case "N":
                if (arrayComando.length != 3) {
                    comandoMal = true;
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        comandoMal = true;
                    }
                }
                break;
            case "G":
                if (arrayComando.length != 3) {
                    comandoMal = true;
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        comandoMal = true;
                    }
                }
                break;
            case "L":
                if (arrayComando.length != 3) {
                    comandoMal = true;
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        comandoMal = true;
                    }
                }
                break;
            case "P":
                if (arrayComando.length != 3) {
                    comandoMal = true;
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        comandoMal = true;
                    }
                }
                break;
            case "B":
                if (arrayComando.length != 3) {
                    comandoMal = true;
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        comandoMal = true;
                    }
                }
                break;
            default:
                comandoMal = true;
                break;
        }

        return comandoMal;
    }
    
    /*
    El método comprobarPosicionMatriz comprueba si la posición introducida existe en la matriz.
    */
    public boolean comprobarPosicionMatriz(String comando) {

        String arrayComando[] = comando.split(" ");
        int filaM = Integer.parseInt(arrayComando[1]);
        int columnaM = Integer.parseInt(arrayComando[2]);

        if (filaM <= this.filas && columnaM <= this.columnas && filaM >= 0 && columnaM >= 0) {
            return false;
        } else {
            return true;
        }
    }

    /*
    El método zombiesLlegan comprueba la columna 0 por si hay un zombie.
    */
    public boolean zombiesLlegan() {

        for (int i = 0; i < this.filas; i++) {
            if (this.matrizTablero[i][0].getNPC() instanceof ZombieComun
                    || this.matrizTablero[i][0].getNPC() instanceof Caracubo
                    || this.matrizTablero[i][0].getNPC() instanceof Deportista) {
                return true;
            }
        } 
        return false;
    }

}
