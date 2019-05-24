/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Alvaro y Patricia
 */
public class ExcepcionJuego extends Exception {

    private static final String ZOMBIES_HAN_LLEGADO = "¡Has perdido! Los zombies han llegado a tu casa :(";
    private static final String ERROR_COMANDO = "Comando mal introducido. Introdúcelo de nuevo.";
    private static final String NO_EXISTE_POSICION = "La posición introducida no existe.";
    
    public ExcepcionJuego(String txt) {
        super(txt);
    }
}
