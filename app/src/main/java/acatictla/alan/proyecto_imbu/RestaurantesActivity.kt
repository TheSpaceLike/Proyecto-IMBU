package acatictla.alan.proyecto_imbu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_restaurantes.*

class RestaurantesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btn_restaurante.setOnClickListener {
            val intent = Intent(this, RestauranteActivity::class.java)
            startActivity(intent)
        }
    }
}
