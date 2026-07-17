package ders5

fun main() {

    println("Sayı Tahmin Oyununa Hoşgeldiniz!")
    println("Şimdi ben bir sayı seçeceğim ve sen de bunu bilmelisin!")
    println("Seçeceğim 0-100 arasında bir sayı olacak, şimdi sayıyı seçtim.")

    val rasgeleSayi = (0.. 100).random()
    println(rasgeleSayi)

    val oyuncuTahmini = readln().toIntOrNull()

    if (oyuncuTahmini == null){
        println("Lütfen geçerli bir sayı giriniz!")
    } else if (oyuncuTahmini > 100 || oyuncuTahmini < 0){
        print("Lüften 1-100 arası bir sayı girini!")
    } else{
        if (oyuncuTahmini == rasgeleSayi){
            println("Tahminin tuttu! TEBRİKLER")
        } else if (oyuncuTahmini > rasgeleSayi){
            println("Tuttuğum sayi tahmininden yüksek!")
        } else{
            println("Tuttuğum sayi tahmininden düşük!")
        }
    }
}