package ders3.alistirmalar

/*
📏 Kişisel Sağlık Raporu (Gelişmiş VKİ): Dersteki örneğimizi kişiselleştirelim.
 Program çalıştığında önce kullanıcının adını, ardından boyunu (cm) ve kilosunu (kg) sorsun.
 Son olarak ekrana şu çıktıyı versin: "Sayın [İsim], Vücut Kitle İndeksiniz: [VKİ Değeri]." VKİ değerini
 yazdırırken virgülden sonra sadece 2 basamak göstermeyi unutmayın.
 */

fun main() {

    println("Lutfen adınızı giriniz: ")
    val ad = readln()

    println("Lutfen boyunuzu giriniz: ")
    val boy = readln().toDouble()

    println("Lutfen kilonuzu giriniz: ")
    val kilo = readln().toDouble()

    val boyIndeksi = boy / 100
    val vicutKitleIndeksi = kilo / (boyIndeksi * boyIndeksi)
    val formatliVKI = "%.2f".format(vicutKitleIndeksi)

    println("Sayın [$ad], Vücut Kitle İndeksiniz: [$formatliVKI].")
}