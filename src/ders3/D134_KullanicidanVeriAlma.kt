package ders3

fun main() {

    print("Adınızı gir: ")
    val isim = readln() // Hep string verecektir!

    print("Kilonu gir: ")
    val dunyaKilosu = readln().toInt() // Stringi Integera çevirdik!

    val marsKilosu = dunyaKilosu * 0.38
    val formatliMarsKilosu = "%.3f".format(marsKilosu) // <- Floatun 00000000000'larını azaltmak için

    println("Adınız $isim ve dunyadaki kilonuz $dunyaKilosu kg")
    println("Adınız $isim ve marstaki kilonuz $formatliMarsKilosu kg")


}