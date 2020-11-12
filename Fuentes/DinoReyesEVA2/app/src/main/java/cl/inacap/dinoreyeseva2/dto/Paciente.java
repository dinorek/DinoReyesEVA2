package cl.inacap.dinoreyeseva2.dto;

import java.io.Serializable;
import java.text.DateFormat;

public class Paciente implements Serializable {
    private int rut;
    private String nombre;
    private  String apellido;
    private DateFormat fechaExamen;

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public DateFormat getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(DateFormat fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "rut=" + rut +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaExamen=" + fechaExamen +
                '}';
    }
}
