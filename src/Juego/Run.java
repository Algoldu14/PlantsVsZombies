/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Excepciones.ExcepcionJuego;
import Excepciones.ExcepcionPlanta;

/**
 *
 * @author Alvaro y Patricia
 */
public class Run {

    /**
     * @param args the command line arguments
     * @throws Excepciones.ExcepcionPlanta
     * @throws Excepciones.ExcepcionJuego
     */
    public static void main(String[] args) throws ExcepcionPlanta, ExcepcionJuego  {

        Tablero tablero = new Tablero();

        tablero.actualizarTablero();

    }

}
