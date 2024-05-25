package com.canerdedeoglu.sayitahminet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.canerdedeoglu.sayitahminet.databinding.FragmentSonucEkraniBinding


class SonucEkraniFragment : Fragment() {

    lateinit var viewBinding: FragmentSonucEkraniBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        viewBinding = FragmentSonucEkraniBinding.inflate(inflater, container, false)

        viewBinding.btnTekrar.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anaSayfaGidis)
        }

        return viewBinding.root
    }


}