package acatictla.alan.proyecto_imbu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MenuPrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle = intent.extras
        if (bundle != null){
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")
        }
    }
}
