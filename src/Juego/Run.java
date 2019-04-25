/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Alvaro
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca filas, columnas y dificultad.");
        int filas = entrada.nextInt();
        int columnas = entrada.nextInt();
        String dif= entrada.next();
        Celda[][] matriz = new Celda[filas][columnas];
        Tablero tablero = new Tablero();
        tablero.setFilas(filas);
        tablero.setColumnas(columnas);
        tablero.setMatrizTablero(matriz);
        
        tablero.setDificultad(dif);
             
        tablero.crearTablero();
    }

}
