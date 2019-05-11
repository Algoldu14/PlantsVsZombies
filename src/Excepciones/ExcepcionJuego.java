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
public class ExcepcionJuego extends Exception {

    private String comando;

    public ExcepcionJuego(String comando) {
        this.comando = comando;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }

    public static boolean esNumerico(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    @Override
    public String getMessage() {

        String mensaje = "";
        
        String arrayComando[] = this.comando.split(" ");

        switch (arrayComando[0]) {
            case "N":
                if (arrayComando.length != 4) {
                    mensaje = "Comando mal introducido. Introduzcalo de nuevo.";
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        mensaje = "Comando mal introducido. Introduzcalo de nuevo.";
                    }
                    if (arrayComando[3] != "BAJA" || arrayComando[3] != "MEDIA"
                            || arrayComando[3] != "ALTA" || arrayComando[3] != "IMPOSIBLE") {
                        mensaje = "Dificultad mal introducida. Introduzcalo de nuevo.";
                    }
                }
                break;
            case "G":
                if (arrayComando.length != 3) {
                    mensaje = "Comando mal introducido. Introduzcalo de nuevo.";
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        mensaje = "Comando mal introducido. Introduzcalo de nuevo.";
                    }
                }
                break;
            case "L":
                if (arrayComando.length != 3) {
                    mensaje = "Comando mal introducido. Introduzcalo de nuevo.";
                } else {
                    if (!(this.esNumerico(arrayComando[1]) && this.esNumerico(arrayComando[2]))) {
                        mensaje = "Comando mal introducido. Introduzcalo de nuevo.";
                    }
                }
                break;
            case "AYUDA":
                break;
            case "S":
                break;
            case "":
                break;
            default:
                mensaje = "Comando mal introducido. Introduzcalo de nuevo.";
                break;
        }

        return mensaje;
    }

}
