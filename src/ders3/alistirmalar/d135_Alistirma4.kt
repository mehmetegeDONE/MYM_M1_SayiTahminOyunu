package ders3.alistirmalar

fun main() {
    /*
    ⭐ EFSANEVİ BONUS GÖREV: Ejderha Savaşı Simülatörü

Bu görev, bu derste öğrendiğiniz tüm araçları (Girdiler, Tür Dönüşümleri, Rastgele Sayılar, Bileşik Operatörler ve Metin Şablonları)
tek bir algoritmada birleştiren en kapsamlı meydan okumadır!

Ejderhanın canını temsil eden ejderhaCani adında bir değişkeni var ile tanımlayın ve başlangıç değerini 1000.0 (Double) yapın.
Kullanıcıdan kahramanının adını (String) ve temel saldırı gücünü (var saldiriGucu – Double) konsol üzerinden isteyin.
Şans Faktörü (Kritik Vuruş): Sistem 10 ile 50 (sınırlar dahil) arasında rastgele bir tam sayı üretsin.
 Bu kritik hasar bonusunu, kahramanın mevcut saldırı gücüne += operatörü ile ekleyin.
Kahramanın ulaştığı bu yeni toplam saldırı gücünü, ejderhanın canından -= operatörünü kullanarak düşün.
Konsola String şablonlarının sınırlarını zorlayan, son derece detaylı bir savaş raporu yazdırın. Raporda kahraman adını, kritik hasar miktarını, toplam hasarı ve ejderhanın kalan canını (virgülden sonra sadece iki basamak görünecek şekilde formatlayarak) gösterin.
     */
    var ejderhaCani = 1000.0

    print("Kahraman adınız nedir?: ")
    val kahramanAdi = readln()
    print("Kahraman saldiri gucu nedir?: ")
    var saldiriGucu = readln().toDouble()


    val kritikBonus = (10..50).random()
    saldiriGucu += kritikBonus
    ejderhaCani -= saldiriGucu

    println("""
        -Kahraman: ${kahramanAdi.uppercase()}'nın durumu-
        
        Kahraman       ) $kahramanAdi
        Can            ) $ejderhaCani
        Alınan Hasar   ) $saldiriGucu
    """.trimIndent())


}