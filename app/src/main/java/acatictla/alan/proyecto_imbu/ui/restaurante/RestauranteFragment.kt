package acatictla.alan.proyecto_imbu.ui.restaurante

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import acatictla.alan.proyecto_imbu.R
import acatictla.alan.proyecto_imbu.RestauranteActivity
import android.content.Intent
import kotlinx.android.synthetic.main.activity_restaurantes.*

class RestauranteFragment : Fragment() {

    companion object {
        fun newInstance() = RestauranteFragment()
    }

    private lateinit var viewModel: RestauranteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.activity_restaurantes, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RestauranteViewModel::class.java)
        btn_restaurante.setOnClickListener {
            val intent = Intent(activity, RestauranteActivity::class.java)
            startActivity(intent)
        }
    }

}
