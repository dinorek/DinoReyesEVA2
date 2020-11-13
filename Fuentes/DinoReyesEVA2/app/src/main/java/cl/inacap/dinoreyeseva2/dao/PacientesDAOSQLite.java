package cl.inacap.dinoreyeseva2.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cl.inacap.dinoreyeseva2.dto.Paciente;
import cl.inacap.dinoreyeseva2.helpers.PacientesSQLiteHelper;

public class PacientesDAOSQLite implements PacientesDAO {
    private PacientesSQLiteHelper pacientesHelper;
    public PacientesDAOSQLite(Context context){
        this.pacientesHelper = new PacientesSQLiteHelper(context,"DBPacientes", null,1);
        }


    @Override
    public List<Paciente> getAll() {
        SQLiteDatabase reader = this.pacientesHelper.getReadableDatabase();
        List<Paciente> pacientes = new ArrayList<>();
        try {
            if (reader != null){
                Cursor c = reader.rawQuery("SELECT id,rut,nombre,apellido,fecha,areaTrabajo,sintomas,tos,temperatura,presionA" +
                        " FROM pacientes",null);
                if(c.moveToFirst()){
                    do {
                        Paciente p = new Paciente();
                        p.setId(c.getInt(0));
                        p.setRut(c.getInt(1));
                        p.setNombre(c.getString(2));
                        p.setApellido(c.getString(3));
                        p.setFechaExamen(c.getInt(4));
                        p.setAreaTrabajo(c.getString(5));
                        p.setSintomas(Boolean.valueOf(c.getString(6)));
                        p.setTos(Boolean.valueOf(c.getString(7)));
                        p.setTemperatura(c.getDouble(8));
                        p.setPresionA(c.getString(9));
                        pacientes.add(p);

                    }while(c.moveToNext());
                }
                reader.close();
            }
        }
        catch(Exception ex){
            Log.e("PACIENTESDAO", ex.toString());
            pacientes = null;
        }
        return pacientes;
    }

    @Override
    public Paciente save(Paciente p) {
        SQLiteDatabase writer = pacientesHelper.getWritableDatabase();
        String sql = String.format("INSERT INTO pacientes(rut,nombre,apellido,fecha,areaTrabajo,sintomas,tos,temperatura,presionA) " +
                "VALUES('%d','%s','%s','%d','%s','%s','%s','%d','%d')",p.getRut(),p.getNombre(),p.getApellido(),p.getFechaExamen(),p.getAreaTrabajo(),p.getSintomas(),p.getTos(),p.getTemperatura(),p.getPresionA());
       writer.execSQL(sql);
       writer.close();
        return p;
    }
}
