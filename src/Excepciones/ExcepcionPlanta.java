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
public class ExcepcionPlanta extends Exception {

    public static final String INSUFICIENTES_SOLES = "No tienes suficientes soles para comprar esta planta. ";
    public static final String POSICION_OCUPADA = "No puedes poner esta planta aqui. ";

    public ExcepcionPlanta(String txt) {
        super(txt);
    }
}
