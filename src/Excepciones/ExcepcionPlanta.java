/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Alvaro
 */
public class ExcepcionPlanta extends Exception {

    private int difSoles;

    public ExcepcionPlanta(int difSoles) {
        this.difSoles = difSoles;
    }

    @Override
    public String getMessage() {

        String mensaje = "";

        if (this.difSoles < 0) {
            mensaje = "No puedes comprar esta planta.";
        }

        return mensaje;
    }
}
