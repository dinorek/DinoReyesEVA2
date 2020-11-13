package cl.inacap.dinoreyeseva2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import cl.inacap.dinoreyeseva2.dao.PacientesDAO;
import cl.inacap.dinoreyeseva2.dao.PacientesDAOSQLite;
import cl.inacap.dinoreyeseva2.dto.Paciente;

public class RegistroPacientesActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText nombreTxt;
    private EditText apellidoTxt;
    private EditText rutTxt;
    private DatePicker fechaExamenDp;
    private Spinner areaTrabajoSpn;
    private Switch sintomasSw;
    private Switch tosSw;
    private EditText temperaturaTxt;
    private EditText presionATxt;
    private Button registrarBtn;
    private PacientesDAO pacientesDAO = new PacientesDAOSQLite(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_pacientes);
        this.toolbar = findViewById(R.id.toolbar);
        this.rutTxt = findViewById(R.id.rut_paciente_cd);
        this.nombreTxt = findViewById(R.id.nombre_paciente_txt_cd);
        this.apellidoTxt = findViewById(R.id.apellido_paciente_txt_cd);
        this.fechaExamenDp = findViewById(R.id.fecha_examen_paciente_date_cd);
        this.areaTrabajoSpn= findViewById(R.id.areaT_paciente_spinner_cd);
        this.sintomasSw = findViewById(R.id.sintomas_paciente_switch_cd);
        this.tosSw = findViewById(R.id.tos_paciente_txt_cd);
        this.temperaturaTxt = findViewById(R.id.temperatura_paciente_txt_cd);
        this.presionATxt = findViewById(R.id.presionA_paciente_txt_cd);
        this.registrarBtn = findViewById(R.id.registrar_btn);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.combo_areaT,android.R.layout.simple_spinner_item);

        this.registrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Paciente p = new Paciente();
                p.setRut(Integer.parseInt(rutTxt.getText().toString()));
                p.setNombre(nombreTxt.getText().toString());
                p.setApellido(apellidoTxt.getText().toString());
                p.setFechaExamen(Integer.parseInt(fechaExamenDp.getCalendarView().toString()));
                p.setAreaTrabajo(areaTrabajoSpn.getSelectedItem().toString());
                p.setSintomas(sintomasSw.getSplitTrack());
                p.setTos(tosSw.getSplitTrack());
                p.setTemperatura(Double.parseDouble(temperaturaTxt.getText().toString()));
                p.setPresionA(presionATxt.getText().toString());
                pacientesDAO.save(p);
                startActivity(new Intent(RegistroPacientesActivity.this,PrincipalActivity.class));


            }
        });




    }
    }