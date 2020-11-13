package cl.inacap.dinoreyeseva2.dao;

import java.util.List;

import cl.inacap.dinoreyeseva2.dto.Paciente;

public interface PacientesDAO {
    List<Paciente> getAll();
    Paciente save(Paciente p);


}
