package cl.inacap.dinoreyeseva2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import cl.inacap.dinoreyeseva2.adapters.PacientesArrayAdapter;
import cl.inacap.dinoreyeseva2.dao.PacientesDAO;
import cl.inacap.dinoreyeseva2.dao.PacientesDAOLista;
import cl.inacap.dinoreyeseva2.dao.PacientesDAOSQLite;
import cl.inacap.dinoreyeseva2.dto.Paciente;

public class PrincipalActivity extends AppCompatActivity {
    private FloatingActionButton agregarBtn;
    private ListView pacientes_lv;
    private List<Paciente> pacientes;
    private PacientesArrayAdapter adaptador;
    private PacientesDAO pacientesDAO = new PacientesDAOSQLite(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.agregarBtn = findViewById(R.id.agregar_btn_fb);
        this.agregarBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(PrincipalActivity.this, RegistroPacientesActivity.class));
            }
        });


            }




    protected void onResume(){
        super.onResume();
        pacientes = pacientesDAO.getAll();
        adaptador = new PacientesArrayAdapter(this, R.layout.pacientes_list, pacientes);
        pacientes_lv = findViewById(R.id.pacientes_lv);
        pacientes_lv.setAdapter(adaptador);
        pacientes_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(PrincipalActivity.this, VerPacienteActivity.class);
                Paciente pacienteActual = pacientes.get(i);
                intent.putExtra("paciente", pacienteActual);
                startActivity(intent);

            }
        });
    }
}