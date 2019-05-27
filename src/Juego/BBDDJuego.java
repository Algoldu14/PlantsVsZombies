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

    public BBDDJuego() {
    }

    public static HashMap<String, Jugador> jugadoresR = new HashMap<>();

    public static HashMap<String, Jugador> getJugadoresR() {
        return jugadoresR;
    }

    public static void setJugadoresR(HashMap<String, Jugador> jugadoresR) {
        BBDDJuego.jugadoresR = jugadoresR;
    }

    public static void altaJugador(Jugador jr) {
        jugadoresR.put(jr.getDNI(), jr);
    }

    public static void bajaJugador(String DNI) {
        jugadoresR.remove(DNI);
    }

    /*
     Guarda los datos de los jugadores en el fichero
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

    /*
     Carga los datos de los jugadores en el fichero
    */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo jugador
            FileInputStream istreamPer = new FileInputStream("jugadoresRanking.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            jugadoresR = (HashMap) oisPer.readObject();
            istreamPer.close();
        } catch (EOFException e) {

        } catch (FileNotFoundException e) {//Si no hay copia de seguridad, le metemos unos jugadores de serie
            LocalDate fecha1 = LocalDate.of(2005, 12, 01);
            LocalDate fecha2 = LocalDate.of(2018, 11, 02);
            LocalDate fecha3 = LocalDate.of(2018, 12, 27);
            LocalDate fecha4 = LocalDate.of(2019, 6, 21);
            LocalDate fecha5 = LocalDate.of(2011, 9, 02);
            Jugador jugador1 = new Jugador("Francisco", "03256894S", fecha1, 100);
            BBDDJuego.altaJugador(jugador1);
            Jugador jugador2 = new Jugador("Isabel", "03214625P", fecha2, 45);
            BBDDJuego.altaJugador(jugador2);
            Jugador jugador3 = new Jugador("Patricia", "03211093V", fecha3, 150);
            BBDDJuego.altaJugador(jugador3);
            Jugador jugador4 = new Jugador("Álvaro", "03202759D", fecha4, 89);
            BBDDJuego.altaJugador(jugador4);
            Jugador jugador5 = new Jugador("Manolo", "03256981T", fecha5, 23);
            BBDDJuego.altaJugador(jugador5);
        } catch (IOException | ClassNotFoundException e) {//De igual manera que en el apartado anterior
            LocalDate fecha1 = LocalDate.of(2005, 12, 01);
            LocalDate fecha2 = LocalDate.of(2018, 11, 02);
            LocalDate fecha3 = LocalDate.of(2018, 12, 27);
            LocalDate fecha4 = LocalDate.of(2019, 6, 21);
            LocalDate fecha5 = LocalDate.of(2011, 9, 02);
            Jugador jugador1 = new Jugador("Francisco", "03256894S", fecha1, 100);
            BBDDJuego.altaJugador(jugador1);
            Jugador jugador2 = new Jugador("Isabel", "03214625P", fecha2, 45);
            BBDDJuego.altaJugador(jugador2);
            Jugador jugador3 = new Jugador("Patricia", "03211093V", fecha3, 150);
            BBDDJuego.altaJugador(jugador3);
            Jugador jugador4 = new Jugador("Álvaro", "03202759D", fecha4, 89);
            BBDDJuego.altaJugador(jugador4);
            Jugador jugador5 = new Jugador("Manolo", "03256981T", fecha5, 23);
            BBDDJuego.altaJugador(jugador5);
        }
    }//fin cargarDatos

}
