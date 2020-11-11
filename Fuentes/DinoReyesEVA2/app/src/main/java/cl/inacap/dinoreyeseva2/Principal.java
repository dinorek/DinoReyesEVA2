package cl.inacap.dinoreyeseva2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Principal extends AppCompatActivity {
// ListView que muestra todos los exámenes efectuados (mostrando el resultado del toString, el
//cual debe incluir Rut, Nombre, Apellido, Fecha de Examen en formato dd/MM/yyyy) de la clase Paciente.
//Los pacientes con covid deben aparecer con un icono de alerta (Debe usted definir el icono a utilizar).
//Al presionar un elemento de la lista debe llamar al Activity “VerPaciente” con el paciente seleccionado.
//En la parte inferior agregar un floating button que permita efectuar el registro de un nuevo Paciente,
//llamando al activity Registro de Paciente.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        this.setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
    }
}