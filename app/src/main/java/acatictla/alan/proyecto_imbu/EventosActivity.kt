package acatictla.alan.proyecto_imbu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eventos.*

class EventosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eventos)

        btn_evento.setOnClickListener {
            val intent = Intent(this, EventoActivity::class.java)
            startActivity(intent)
        }
    }
}
