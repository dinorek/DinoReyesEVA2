package cl.inacap.dinoreyeseva2.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import cl.inacap.dinoreyeseva2.R;
import cl.inacap.dinoreyeseva2.dto.Paciente;

public class PacientesArrayAdapter extends ArrayAdapter<Paciente> {
    Activity activity;
    private List<Paciente> pacientes;
    public PacientesArrayAdapter(@NonNull Activity context, int resource, @NonNull List<Paciente> objects) {

        super(context, resource, objects);
        this.activity = context;
        this.pacientes = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View fila = inflater.inflate(R.layout.pacientes_list, null, true);
        TextView nombreTv = fila.findViewById(R.id.nombre_paciente_lv);
        TextView rutTv = fila.findViewById(R.id.rut_paciente_lv);
        TextView apellidoTv = fila.findViewById(R.id.apellido_paciente_lv);
        TextView fechaTv = fila.findViewById(R.id.fecha_examen_paciente_lv);
        Paciente actual = pacientes.get(position);
        nombreTv.setText(actual.getNombre());
        return fila;
    }
}
