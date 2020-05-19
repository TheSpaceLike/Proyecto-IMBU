package acatictla.alan.proyecto_imbu.ui.restaurantes2

import acatictla.alan.proyecto_imbu.EventoActivity
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import acatictla.alan.proyecto_imbu.R
import acatictla.alan.proyecto_imbu.RestauranteActivity
import android.content.Intent
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_eventos.*

class Restaurantes2Fragment : Fragment() {

    companion object {
        fun newInstance() = Restaurantes2Fragment()
    }

    private lateinit var viewModel: Restaurantes2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        var root = inflater.inflate(R.layout.activity_eventos, container, false)

        var btn: ImageView = root.findViewById(R.id.Volver)

//        btn.setOnClickListener { No funciona bien, mata a toda la actividad
//            activity?.finish()
//        }
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(Restaurantes2ViewModel::class.java)
        btn_evento.setOnClickListener {
            val intent = Intent(activity, EventoActivity::class.java)
            startActivity(intent)
        }

        Volver.setOnClickListener {
            fragmentManager?.popBackStack()
        }
    }

}
