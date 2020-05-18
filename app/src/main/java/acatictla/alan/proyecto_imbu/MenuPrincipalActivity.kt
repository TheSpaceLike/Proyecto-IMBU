package acatictla.alan.proyecto_imbu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MenuPrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bundle = intent.extras
        if (bundle != null){
            val nombre = bundle.getString("name")
            val correo = bundle.getString("email")
        }

        navbarmain.setOnClickListener {
            val intent = Intent(this, DrawerActivity::class.java)
            startActivity(intent)
        }

//        btn_eventos.setOnClickListener{
//            val intent = Intent(this, EventosActivity::class.java)
//            startActivity(intent)
//        }
    }
}
