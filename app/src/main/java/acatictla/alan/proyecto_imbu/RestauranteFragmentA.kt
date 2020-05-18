package acatictla.alan.proyecto_imbu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import acatictla.alan.proyecto_imbu.ui.restaurante.RestauranteFragment

class RestauranteFragmentA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.restaurante_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RestauranteFragment.newInstance())
                .commitNow()
        }
    }
}
