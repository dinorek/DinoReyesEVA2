package cl.inacap.dinoreyeseva2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RegistroPacientes extends AppCompatActivity {
//Debe mostrar un formulario solicitando:
//• Rut del Paciente: Debe ser un rut chileno válido en formato 12345678-9
//• Nombre: String, obligatorio
//• Apellido: String, obligatorio
//• Fecha de Examen: DatePickerDialog, debe ser una fecha mayor o igual que el día actual
//• Area de Trabajo: Spinner, con las opciones:
//o Atención a publico
//o Otro
//• Presenta síntomas de covid?: boolean, representado por Switch
//• Temperatura: Valor numérico, mayor que 20, acepta decimales
//• Presenta tos?: boolean, representado por Switch
//• Presión arterial: Valor numérico sin decimales
//Si el formulario es válido, debe registrar un nuevo registro en la base de datos SQLite asociada a ello y
//mostrar nuevamente el activity Principal. En caso contrario, debe mostrar los mensajes de error respectivos
//mediante un Dialogo de alerta.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_pacientes);
    }
}