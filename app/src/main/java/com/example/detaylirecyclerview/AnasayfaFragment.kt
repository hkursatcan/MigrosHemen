package com.example.detaylirecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.detaylirecyclerview.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        //tasarim.toolbarAnasayfa.title = "Filmler"
        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)




        val filmlerListesi = ArrayList<Filmler>()
        val f1 = Filmler(1,"Migros Ev Lezzetleri Tavuklu Cheddarlı Wrap 185 G ","pic1",2008,"32,25","Nuri Bilge Ceylan")
        val f2 = Filmler(2,"Migros Ev Lezzetleri Limonlu Cheesecake 125 G","pic2",2009,"15,75","Quentin Tarantino")
        val f3 = Filmler(3,"Migros Ev Lezzetleri Şehriyeli Pirinç Pilavı 180 G","pic3",2006,"42.25","Christopher Nolan")
        val f4 = Filmler(4,"Migros Ev Lezzetleri Izgara Piliç 180 G","pic4",2013,"18,0","Christopher Nolan")
        val f5 = Filmler(5,"Migros Ev Lezzetleri İrmik Helvası 150 G","pic5",2011,"16,75","Quentin Tarantino")
        filmlerListesi.add(f1)
        filmlerListesi.add(f2)
        filmlerListesi.add(f3)
        filmlerListesi.add(f4)
        filmlerListesi.add(f5)

        val adapter = FilmlerAdapter(requireContext(),filmlerListesi)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }
}