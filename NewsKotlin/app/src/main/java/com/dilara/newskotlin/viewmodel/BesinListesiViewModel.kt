package com.dilara.newskotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dilara.newskotlin.model.Besin

class BesinListesiViewModel:ViewModel(){
    val besinler=MutableLiveData<List<Besin>>()//gözlemlenebilir
    val besinHataMesaji=MutableLiveData<Boolean>()
    val besinYukleniyor=MutableLiveData<Boolean>()

    fun refreshData(){
        val muz=Besin("Muz","100","10","5","1","test.com")
        val çilek=Besin("çilek","100","10","5","1","test.com")

        val besinListesi= arrayListOf<Besin>(muz,çilek)

        besinler.value=besinListesi
        besinHataMesaji.value=false
        besinYukleniyor.value=false
    }

}