package com.canerdedeoglu.sayitahminet

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.canerdedeoglu.sayitahminet.databinding.FragmentOyunEkraniBinding

class OyunEkraniFragment : Fragment() {

    private var hak = 5
    private val sayi = (1..100).random()
    lateinit var viewBinding: FragmentOyunEkraniBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentOyunEkraniBinding.inflate(inflater, container, false)

        Log.d("sayi", "tahminEt: $sayi")

        viewBinding.btnTahmin.setOnClickListener {
            tahminEt()
        }

        return viewBinding.root
    }

    private fun tahminEt() {
        val sayiGir = viewBinding.txtSayiGir.text.toString().toIntOrNull()

        if (sayiGir == null) {
            Toast.makeText(requireContext(), "Lütfen sayı giriniz!", Toast.LENGTH_SHORT).show()
            return
        }

        val sonuc = sayiGir == sayi

        if (sonuc) {
            Log.d("sonuc", "true")
            val action = OyunEkraniFragmentDirections.sonucEkranıGecis(true)
            Navigation.findNavController(viewBinding.root).navigate(action)
        } else {
            Log.d("sonuc", "false")
            hak--

            if (hak > 0) {
                if (sayiGir < sayi) {
                    viewBinding.txtIslem.text = "Sayıyı Arttır!"
                } else {
                    viewBinding.txtIslem.text = "Sayıyı Azalt!"
                }
                viewBinding.txtHak.text = "Kalan Hakkınız: $hak"
            } else {
                val action = OyunEkraniFragmentDirections.sonucEkranıGecis(false)
                Navigation.findNavController(viewBinding.root).navigate(action)
            }
        }
    }
}
