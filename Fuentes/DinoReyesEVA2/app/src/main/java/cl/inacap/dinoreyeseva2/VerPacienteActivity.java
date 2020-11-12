package cl.inacap.dinoreyeseva2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

import cl.inacap.dinoreyeseva2.dto.Paciente;

public class VerPacienteActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private TextView nombrePacienteTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_paciente);
        this.toolbar = findViewById(R.id.toolbar);
        this.nombrePacienteTxt = findViewById(R.id.nombrePacienteTxt);

        this.setSupportActionBar(this.toolbar);
        if(getIntent() != null){
            Paciente paciente = (Paciente)getIntent().getSerializableExtra("paciente");
            this.nombrePacienteTxt.setText(paciente.getNombre());

        }
    }
}