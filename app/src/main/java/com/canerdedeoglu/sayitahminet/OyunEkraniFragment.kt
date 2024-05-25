package com.canerdedeoglu.sayitahminet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.canerdedeoglu.sayitahminet.databinding.FragmentOyunEkraniBinding


class OyunEkraniFragment : Fragment() {

    lateinit var viewBinding: FragmentOyunEkraniBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        viewBinding = FragmentOyunEkraniBinding.inflate(inflater, container, false)

        viewBinding.btnTahmin.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sonucEkranıGecis)
        }


        return viewBinding.root
    }

}