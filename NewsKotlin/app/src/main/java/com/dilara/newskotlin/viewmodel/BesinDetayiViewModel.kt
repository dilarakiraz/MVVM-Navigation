package com.dilara.newskotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dilara.newskotlin.model.Besin

class BesinDetayiViewModel:ViewModel() {

    val besinLiveData=MutableLiveData<Besin>()

    fun roomVerisiniAl(){
        val muz=Besin("Muz","100","10","5","1","test.com")
        besinLiveData.value=muz
    }

}