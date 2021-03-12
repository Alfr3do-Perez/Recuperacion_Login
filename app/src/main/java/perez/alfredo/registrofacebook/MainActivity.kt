package perez.alfredo.registrofacebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton_registrar:Button = findViewById(R.id.boton_registrar) as Button;
        var campo_nombre:TextView = findViewById(R.id.editText_nombre) as TextView;
        var campo_apellido:TextView = findViewById(R.id.editText_apellido) as TextView;

        boton_registrar.setOnClickListener {
            var nombre:String = campo_nombre.text.toString();
            var apellido:String = campo_apellido.text.toString();

            //Toast.makeText(this, "$nombre $apellido", Toast.LENGTH_LONG).show();

            val intent:Intent = Intent(this, BienvenidaActivity::class.java);
            intent.putExtra("nombre",nombre);
            intent.putExtra("apellido", apellido);
            startActivity(intent);
        }
    }
}