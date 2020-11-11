package cl.inacap.dinoreyeseva2.dto;

import java.text.DateFormat;

public class Paciente {
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
}
