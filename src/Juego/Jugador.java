/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Alvaro y Patricia
 */
public class Jugador implements Serializable {

    private String nombre;
    private String DNI;
    private LocalDate fechaRegistro;
    private int puntos;

    public Jugador(String nombre, String DNI, LocalDate fechaRegistro, int puntos) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaRegistro = fechaRegistro;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return " Nombre: " + this.nombre + "  DNI: " + this.DNI + "  Puntos: " + this.puntos + "  Fecha registro: " + this.fechaRegistro + "\n";
    }

}
