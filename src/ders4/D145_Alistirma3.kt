package ders4

fun main() {
    /*
    📝 Adım 1 – Çoklu Durum Kontrolü: Not ortalaması
    85 ve üzeriyse “Takdir Belgesi”, 50 ve 85 arasındaysa “Tebrikler, geçtiniz”,
    50’nin altındaysa “Dersten kaldınız” yazdıran
    bir if - else if - else zinciri kurun.
     */

    val notOrtalamasi = 84

    if (notOrtalamasi < 0 || notOrtalamasi > 100){
        println("Notunuz geçersiz")
    } else if (notOrtalamasi >= 85){
        println("Taktir Belgesi")
    } else if (notOrtalamasi >= 50){
        println("Tebrikler, geçtiniz")
    } else if (notOrtalamasi < 50){
        println("Dersten kaldınız")
    }
}
