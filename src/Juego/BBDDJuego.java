/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/**
 *
 * @author Alvaro
 */
public class BBDDJuego {

    public static HashMap<String, Jugador> jugadoresR = new HashMap<>();

    public static void altaJugador(Jugador jr) {
        jugadoresR.put(jr.getDNI(), jr);
    }

    public static void bajaJugador(String DNI) {
        jugadoresR.remove(DNI);
    }

    /**
     * Guarda los datos de los jugadores en el fichero
     */
    public static void guardarDatos() {
        try {
            FileOutputStream ost = new FileOutputStream("jugadoresRanking.dat");
            ObjectOutputStream oosPer = new ObjectOutputStream(ost);
            //guardamos el array de personas
            oosPer.writeObject(jugadoresR);
            ost.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos 

}
