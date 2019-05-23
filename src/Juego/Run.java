/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import Excepciones.ExcepcionJuego;
import Excepciones.ExcepcionPlanta;
import Ventanas.VentanaInicio;

/**
 *
 * @author Alvaro y Patricia
 */
public class Run {

    public static void main(String[] args) throws ExcepcionPlanta, ExcepcionJuego {

        VentanaInicio miVentanaIni = new VentanaInicio();
        
        miVentanaIni.setVisible(true);
    }

}
