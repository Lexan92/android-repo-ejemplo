package com.example.horosapp2.domain.model

import com.example.horosapp2.R

sealed class HoroscopeInfo(val img:Int, val name:Int) {
    data object Aries:HoroscopeInfo(R.drawable.aries, R.string.aries)
    data object Tauro:HoroscopeInfo(R.drawable.tauro, R.string.taurus)
    data object Geminis:HoroscopeInfo(R.drawable.geminis, R.string.gemini)
    data object Cancer:HoroscopeInfo(R.drawable.cancer, R.string.cancer)
    data object Leo:HoroscopeInfo(R.drawable.leo, R.string.leo)
    data object Virgo:HoroscopeInfo(R.drawable.virgo, R.string.virgo)
    data object Libra:HoroscopeInfo(R.drawable.libra, R.string.libra)
    data object Escorpio:HoroscopeInfo(R.drawable.escorpio, R.string.scorpio)
    data object Sagitario:HoroscopeInfo(R.drawable.sagitario, R.string.sagittarius)
    data object Capricornio:HoroscopeInfo(R.drawable.capricornio, R.string.capricorn)
    data object Acuario:HoroscopeInfo(R.drawable.acuario, R.string.aquarius)
    data object Picis:HoroscopeInfo(R.drawable.piscis, R.string.pisces)

}