package ders5

fun main() {

    val zar = (1.. 6).random()

    println("1'den 6'ya kadar olan bir zar attım!, şimdi onu bulmayı dene bakalım!")
    print("Bir sayı girin: ")
    val kullaniciGirdi = readln().toIntOrNull()

    if (kullaniciGirdi == null){
        println("HATA: Lütfen bir sayı gir")
    } else if (kullaniciGirdi < 1 || kullaniciGirdi > 6){
        println("HATA: Sayın 1-6 arasında bulunmuyor")
    } else{
        if (zar == kullaniciGirdi){
            println("Vay! Tebrikler, Bilmeyi başardın!")
        } else{
            println("Opps bilemediniz... Seçtiğim sayı: $zar'idi")
        }
    }
}