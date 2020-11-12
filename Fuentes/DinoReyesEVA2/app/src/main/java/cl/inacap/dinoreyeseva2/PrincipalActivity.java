package cl.inacap.dinoreyeseva2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import cl.inacap.dinoreyeseva2.adapters.PacientesArrayAdapter;
import cl.inacap.dinoreyeseva2.dao.PacientesDAO;
import cl.inacap.dinoreyeseva2.dao.PacientesDAOLista;
import cl.inacap.dinoreyeseva2.dto.Paciente;

public class PrincipalActivity extends AppCompatActivity {
    // ListView que muestra todos los exámenes efectuados (mostrando el resultado del toString, el
//cual debe incluir Rut, Nombre, Apellido, Fecha de Examen en formato dd/MM/yyyy) de la clase Paciente.
//Los pacientes con covid deben aparecer con un icono de alerta (Debe usted definir el icono a utilizar).
//Al presionar un elemento de la lista debe llamar al Activity “VerPaciente” con el paciente seleccionado.
//En la parte inferior agregar un floating button que permita efectuar el registro de un nuevo Paciente,
//llamando al activity Registro de Paciente.
    private ListView pacientesLv;
    private List<Paciente> pacientes;
    private PacientesArrayAdapter adaptador;
    private PacientesDAO pacientesDAO = PacientesDAOLista.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        pacientes = pacientesDAO.getAll();
        adaptador = new PacientesArrayAdapter(this, R.layout.pacientes_list, pacientes);
        pacientesLv = findViewById(R.id.pacientes_lv);
        pacientesLv.setAdapter(adaptador);
        pacientesLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent intent = new Intent(PrincipalActivity.this, VerPacienteActivity.class);
                Paciente pacienteActual = pacientes.get(i);
                intent.putExtra("paciente", pacienteActual);
                startActivity(intent);

            }
        });
        FloatingActionButton agregar = findViewById(R.id.floating_btn);
        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PrincipalActivity.this, RegistroPacientesActivity.class);
                startActivity(i);
            }
        });

    }
}