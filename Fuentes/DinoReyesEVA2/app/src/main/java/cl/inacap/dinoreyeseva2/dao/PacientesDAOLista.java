package cl.inacap.dinoreyeseva2.dao;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.dinoreyeseva2.dto.Paciente;

public class PacientesDAOLista implements PacientesDAO {
    private List<Paciente> pacientes = new ArrayList<>();
    private static PacientesDAOLista instancia;

    private PacientesDAOLista(){
        Paciente p = new Paciente();
        p.getRut();
        p.getNombre();
        p.getApellido();
        p.getFechaExamen();
        p.getAreaTrabajo();
        p.getSintomas();
        p.getTos();
        p.getTemperatura();
        p.getPresionA();

        pacientes.add(p);


    }

    public static  PacientesDAOLista getInstance(){
        if (instancia == null){
            instancia = new PacientesDAOLista();

        }
        return instancia;

    }

    @Override
    public List<Paciente> getAll() {
        return pacientes;
    }

    @Override
    public Paciente save(Paciente p) {
        pacientes.add(p);
        return p;
    }
}
