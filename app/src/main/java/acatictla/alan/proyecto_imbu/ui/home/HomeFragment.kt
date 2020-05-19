package acatictla.alan.proyecto_imbu.ui.home

import acatictla.alan.proyecto_imbu.DescripcionActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import acatictla.alan.proyecto_imbu.R
import android.content.Intent
import android.widget.ImageView

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
//        val textView: TextView = root.findViewById(R.id.text_home)
//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        var btn1: ImageView = root.findViewById(R.id.btn_desc1)

        btn1.setOnClickListener{
            val intent = Intent(activity, DescripcionActivity::class.java)
            startActivity(intent)
        }

        var btn2: ImageView = root.findViewById(R.id.btn_desc2)

        btn2.setOnClickListener{
            val intent = Intent(activity, DescripcionActivity::class.java)
            startActivity(intent)
        }

        var btn3: ImageView = root.findViewById(R.id.btn_desc3)

        btn3.setOnClickListener{
            val intent = Intent(activity, DescripcionActivity::class.java)
            startActivity(intent)
        }

        var btn4: ImageView = root.findViewById(R.id.btn_desc4)

        btn4.setOnClickListener{
            val intent = Intent(activity, DescripcionActivity::class.java)
            startActivity(intent)
        }

        var btn5: ImageView = root.findViewById(R.id.btn_desc5)

        btn5.setOnClickListener{
            val intent = Intent(activity, DescripcionActivity::class.java)
            startActivity(intent)
        }

        var btn6: ImageView = root.findViewById(R.id.btn_desc6)

        btn6.setOnClickListener{
            val intent = Intent(activity, DescripcionActivity::class.java)
            startActivity(intent)
        }

        return root
    }

}
