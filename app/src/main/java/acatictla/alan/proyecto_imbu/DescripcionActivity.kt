package acatictla.alan.proyecto_imbu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_descripcion.*

class DescripcionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descripcion)

        regresar_desc.setOnClickListener {
            finish()
        }
    }
}
