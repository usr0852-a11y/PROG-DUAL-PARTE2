package net.salesianoslacuesta.investigador;
public abstract class Investigador {

    protected String nombre;
    protected String especialidad;
    protected double sueldo;

    public Investigador(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;

    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}