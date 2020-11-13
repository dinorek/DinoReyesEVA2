package cl.inacap.dinoreyeseva2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import cl.inacap.dinoreyeseva2.dto.Paciente;

public class VerPacienteActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView rutPacienteTxt;
    private TextView nombrePacienteTxt;
    private TextView apellidoPacienteTxt;
    private TextView fechaPacienteTxt;
    private TextView areaTrabajoPacienteTxt;
    private TextView sintomasPacienteTxt;
    private TextView tosPacienteTxt;
    private TextView temperaturaPacienteTxt;
    private TextView presionAPacienteTxt;
    private TextView tituloToolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_paciente);
        this.toolbar = findViewById(R.id.toolbar);
        this.nombrePacienteTxt = findViewById(R.id.nombre_paciente_lv);
        this.rutPacienteTxt = findViewById(R.id.rut_paciente_lv);
        this.apellidoPacienteTxt = findViewById(R.id.apellido_paciente_lv);
        this.fechaPacienteTxt = findViewById(R.id.fecha_examen_paciente_lv);
        this.areaTrabajoPacienteTxt = findViewById(R.id.area_paciente_lv);
        this.sintomasPacienteTxt = findViewById(R.id.sintomas_paciente_lv);
        this.tosPacienteTxt = findViewById(R.id.tos_paciente_lv);
        this.temperaturaPacienteTxt = findViewById(R.id.temperatura_paciente_lv);
        this.presionAPacienteTxt = findViewById(R.id.presionA_paciente_lv);
        this.tituloToolbar = findViewById(R.id.titulo_toolbar);

        this.setSupportActionBar(this.toolbar);
        if(getIntent() != null){
            Paciente paciente = (Paciente)getIntent().getSerializableExtra("paciente");
            this.nombrePacienteTxt.setText(paciente.getNombre());
            this.rutPacienteTxt.setText(paciente.getRut());
            this.apellidoPacienteTxt.setText(paciente.getApellido());
            this.fechaPacienteTxt.setText(paciente.getFechaExamen());
            this.areaTrabajoPacienteTxt.setText(paciente.getAreaTrabajo());
            this.sintomasPacienteTxt.setSelected(paciente.getSintomas());
            this.tosPacienteTxt.setSelected(paciente.getTos());
            this.temperaturaPacienteTxt.setText((int) paciente.getTemperatura());
            this.presionAPacienteTxt.setText(paciente.getPresionA());
            this.tituloToolbar.setText(paciente.getNombre());

        }
    }
}