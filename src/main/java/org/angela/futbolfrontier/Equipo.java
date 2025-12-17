package org.angela.futbolfrontier;

/**
 *
 * @author Angela
 */

public class Equipo {
    private String nombre;
    private String ciudad;
    private int puntos;
    private int golesAFavor;
    private int golesEnContra;

    // Constructor
    public Equipo(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = 0;
        this.golesAFavor = 0;
        this.golesEnContra = 0;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getGolesAFavor() {
        return golesAFavor;
    }

    public void setGolesAFavor(int golesAFavor) {
        this.golesAFavor = golesAFavor;
    }

    public int getGolesEnContra() {
        return golesEnContra;
    }

    public void setGolesEnContra(int golesEnContra) {
        this.golesEnContra = golesEnContra;
    }

    // Método para calcular la diferencia de goles
    public int getDiferenciaDeGoles() {
        return golesAFavor - golesEnContra;
    }

    // Método para mostrar la información del equipo
    @Override
    public String toString() {
        return "Equipo: " + nombre + " | Ciudad: " + ciudad + " | Puntos: " + puntos +
               " | GF: " + golesAFavor + " | GC: " + golesEnContra + " | DG: " + getDiferenciaDeGoles();
    }
}
