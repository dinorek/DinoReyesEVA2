package cl.inacap.dinoreyeseva2.dto;

import java.io.Serializable;

public class Paciente implements Serializable {
    private int id;
    private int rut;
    private String nombre;
    private  String apellido;
    private int fechaExamen;
    private String areaTrabajo;
    private Boolean sintomas;
    private Boolean tos;
    private double temperatura;
    private String presionA;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getFechaExamen() {
        return fechaExamen;
    }

    public void setFechaExamen(int fechaExamen) {
        this.fechaExamen = fechaExamen;
    }

    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

    public boolean getSintomas() {
        return sintomas;
    }

    public void setSintomas(Boolean sintomas) {
        this.sintomas = sintomas;
    }

    public boolean getTos() {
        return tos;
    }

    public void setTos(Boolean tos) {
        this.tos = tos;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getPresionA() {
        return presionA;
    }

    public void setPresionA(String presionA) {
        this.presionA = presionA;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "rut=" + rut +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaExamen=" + fechaExamen +
                ", areaTrabajo='" + areaTrabajo + '\'' +
                ", sintomas=" + sintomas +
                ", tos=" + tos +
                ", temperatura=" + temperatura +
                ", presionA='" + presionA + '\'' +
                '}';
    }
}

