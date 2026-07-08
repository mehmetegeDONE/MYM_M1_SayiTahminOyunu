package ders2

fun main() {

    // DEGİSTİRİLEMEZ DEGİSKEN
    val uygulamaAdi = "Hava Durumu Pro"
    // uygulamaAdi = "Hava Durumu Pro v2." <- (Hatalı çünkü val olana set (atama) yapılamaz"

    // DEGİSTİRİLEBİLİ DEGİSKEN
    var indirimOrani = 10
    indirimOrani = 15 // <- (Var değişken set (atama) yapmamıza izin verir.

    println("Uygulama Adı: " + uygulamaAdi)
    println("Uygulama Oranı: " + indirimOrani)

    val sicaklik = 28                   // Int
    val sehir = "Ankara"                 // String
    val nemOrani = 9.45                   // Double
    val sicaklikOrani = .2f             // Float
    val dogruMu = true                  // Bool
    val charim = 'a'                    // Char
    val buyukSayi = 100000000000000000  // Long

    var sistemMesaji: String // Tipler burada büyük yazılır
    sistemMesaji = "Sıcaklık, uyarı seviyesinde."


}