package acatictla.alan.proyecto_imbu.ui.ui.galeriafragment2

import acatictla.alan.proyecto_imbu.GaleriaActivity
import acatictla.alan.proyecto_imbu.R
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
//import acatictla.alan.proyecto_imbu.ui.R
import android.content.Intent
import kotlinx.android.synthetic.main.activity_galeria.*

class GaleriaFragment2Fragment : Fragment() {

    companion object {
        fun newInstance() = GaleriaFragment2Fragment()
    }

    private lateinit var viewModel: GaleriaFragment2ViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.activity_galeria, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(GaleriaFragment2ViewModel::class.java)

        Volver.setOnClickListener {
            fragmentManager?.popBackStack()
        }

//        btn_gal1.setOnClickListener {
//            val intent = Intent(activity, GaleriaActivity::class.java)
//            startActivity(intent)
//        }
    }

}
