package ders3.alistirmalar

fun main() {
    /*
    🎲 Şanslı İndirim Çarkı:
    Kullanıcıdan sepetindeki toplam tutarı (Double) girmesini isteyin.
    Ardından sisteme 10 ile 50 arasında rastgele bir tam sayı ürettirin; bu sayı kullanıcının o günkü “Şanslı İndirim Yüzdesi” olacak.
    Bu indirim tutarını hesaplayıp sepet tutarından düşün (-= operatörünü kullanın).
    Son olarak ekrana yazdırın: "Tebrikler! Çarktan % [İndirim] indirim kazandınız. Yeni ödeyeceğiniz tutar: [Yeni Tutar] TL."
     */

    print("Lüften toplam sepet tutarını giriniz: ")
    var sepetTutari = readln().toDouble()

    val rasgeleIndirimTutari = (10..50).random()

    val indirimMiktari = sepetTutari * rasgeleIndirimTutari / 100
    sepetTutari -= indirimMiktari

    println("Tebrikler! Çarktan % $rasgeleIndirimTutari indirim kazandınız. Yeni ödeyeceğiniz tutar: $indirimMiktari TL.")
}