package cl.inacap.dinoreyeseva2.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class PacientesSQLiteHelper extends SQLiteOpenHelper {
    private final String sqlCreate = "CREATE TABLE pacientes(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL" +
            ",rut INTEGER, nombre TEXT, apellido TEXT, fecha TEXT, areaTrabajo TEXT, sintomas INTEGER, tos INTEGER,temperatura REAL, presionA INTEGER)";

    public PacientesSQLiteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
sqLiteDatabase.execSQL(sqlCreate);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS pacientes");
        sqLiteDatabase.execSQL(sqlCreate);


    }
}
