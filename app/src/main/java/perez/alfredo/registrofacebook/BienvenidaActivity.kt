package perez.alfredo.registrofacebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BienvenidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)


        var textView_Nombre:TextView = findViewById(R.id.tw_nombre) as TextView;

        var bundle = intent.extras;
        if(bundle != null){
            var nombre = bundle.getString("nombre");
            var apellido = bundle.getString("apellido")
            textView_Nombre.setText("$nombre $apellido")
        }
    }
}