package ders3

fun main() {

    var sansliSayiRange = (1..100) // Range olusturmayı sağlar (1 ve 100 dahil bir sayi istedin) [Eğer bunu yazdırırsan direkt aynısını yazar]
    var sansliSayiRasgele = (1..100).random() // Hep 1 ve 100 arası bir rasgele sayi seçer

    println("Random atanmayan sekilde -> $sansliSayiRange")
    println("Rasgele seçilen sayi -> $sansliSayiRasgele")
}