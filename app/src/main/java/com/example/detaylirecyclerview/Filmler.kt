package com.example.detaylirecyclerview

import java.io.Serializable

data class Filmler(var urunId:Int,
                   var urunAdi:String,
                   var urunResimAdi:String,
                   var urunYil:Int,
                   var urunFiyat:String,
                   var filmYonetmen:String) : Serializable {
}