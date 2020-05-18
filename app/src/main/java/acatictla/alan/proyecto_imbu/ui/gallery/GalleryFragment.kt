package acatictla.alan.proyecto_imbu.ui.gallery

import acatictla.alan.proyecto_imbu.GaleriaActivity
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
import kotlinx.android.synthetic.main.activity_galeria.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

//    companion object{
//        fun newInstance() = GalleryViewModel()
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
            ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        //val textView: TextView = root.findViewById(R.id.text_gallery)
//        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        galleryViewModel = ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        btn_gal1.setOnClickListener {
            val intent = Intent(activity, GaleriaActivity::class.java)
            startActivity(intent)
        }
    }
}
