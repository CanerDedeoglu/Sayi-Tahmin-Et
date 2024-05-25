package com.canerdedeoglu.sayitahminet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.canerdedeoglu.sayitahminet.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {

    lateinit var viewBinding : FragmentAnaSayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        viewBinding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        viewBinding.btnOyunaBasla.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.oyunEkranıGecis)
        }

        return viewBinding.root
    }


}