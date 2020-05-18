package acatictla.alan.proyecto_imbu.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import acatictla.alan.proyecto_imbu.R
import acatictla.alan.proyecto_imbu.RestauranteActivity
import android.content.Intent
import kotlinx.android.synthetic.main.activity_restaurantes.*

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProviders.of(this).get(SlideshowViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_restaurante, container, false)

        btn_restaurante.setOnClickListener {
            var intent = Intent(activity, RestauranteActivity::class.java)
            startActivity(intent)
        }
        return root
    }
}
