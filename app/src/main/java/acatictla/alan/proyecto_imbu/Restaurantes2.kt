package acatictla.alan.proyecto_imbu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import acatictla.alan.proyecto_imbu.ui.restaurantes2.Restaurantes2Fragment

class Restaurantes2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurantes2_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, Restaurantes2Fragment.newInstance())
                .commitNow()
        }
    }
}
