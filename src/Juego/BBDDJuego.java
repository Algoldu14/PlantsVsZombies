/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
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

    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo jugador
            FileInputStream istreamPer = new FileInputStream("jugadoresRanking.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            jugadoresR = (HashMap) oisPer.readObject();
            istreamPer.close();
        } catch (EOFException e) {

        } catch (FileNotFoundException e) {//Si no hay copia de seguridad, le metemos unos jugadores de serie
            LocalDate fecha1 = LocalDate.of(2014, 12, 01);
            LocalDate fecha3 = LocalDate.of(2018, 9, 02);        
            Jugador jugador1 = new Jugador("Francisco Martorell", "03256894S", fecha1, 100);
            BBDDJuego.altaJugador(jugador1);
            Jugador jugador2 = new Jugador("Isabel Fernández", "03214625P", fecha3, 45);
            BBDDJuego.altaJugador(jugador2);
        } catch (IOException | ClassNotFoundException e) {//De igual manera que en el apartado anterior
            LocalDate fecha1 = LocalDate.of(1987, 12, 01);
            LocalDate fecha3 = LocalDate.of(1995, 9, 02);        
            Jugador jugador1 = new Jugador("Francisco Martorell", "03256894S", fecha1, 100);
            BBDDJuego.altaJugador(jugador1);
            Jugador jugador2 = new Jugador("Isabel Fernández", "03214625P", fecha3, 45);
            BBDDJuego.altaJugador(jugador2);
        }
    }//fin cargarDatos

}
