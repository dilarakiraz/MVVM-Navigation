package com.dilara.newskotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.dilara.newskotlin.R
import com.dilara.newskotlin.model.Besin
import com.dilara.newskotlin.view.BesinListesiFragmentDirections
import kotlinx.android.synthetic.main.besin_recycler_row.view.*

class BesinRecyclerAdapter(val besinListesi:ArrayList<Besin>) : RecyclerView.Adapter<BesinRecyclerAdapter.BesinViewHolder>(){
    class BesinViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BesinViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.besin_recycler_row,parent,false)
        return BesinViewHolder(view)
    }

    override fun onBindViewHolder(holder: BesinViewHolder, position: Int) {
        holder.itemView.isim.text=besinListesi.get(position).besinIsim
        holder.itemView.kalori.text=besinListesi.get(position).besinKalori
        //glide ile görsel eklenicek


        holder.itemView.setOnClickListener {
            val action=BesinListesiFragmentDirections.actionBesinListesiFragmentToBesinDetayiFragment(0)
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun getItemCount(): Int {
        return besinListesi.size
    }

    fun besinListesiniGuncelle(yeniBesinListesi:List<Besin>){
        //yeni veri indirildiğinde listeler
        besinListesi.clear() //eski verileri temizler
        besinListesi.addAll(yeniBesinListesi)//yeni besin listesini ekler
        notifyDataSetChanged() //datanın değiştiğinin bildirme işlemi
    }
}