package ders2.d122alistirmalar

fun main() {
    /*
    🛒 Mini Market Otomasyonu: Tek bir alışveriş kalemini modelleyin.
    Ürün adı (String), alınacak adet (Int), birim fiyat (Double) ve ürünün stokta olup olmadığı (Boolean) bilgilerini değişkenlere atayın.
    Adet ile birim fiyatı çarparak ara toplamı hesaplayın ve tüm bu bilgileri konsola düzenli bir şekilde yazdırın.
    */

    val urunAdi = "Kalem"
    val adet = 1
    val birimFiyat = 7.6
    val stoktaVarMi = true

    val araToplam = adet * birimFiyat

    println("ürün adi:  + $urunAdi")
    println("adet:  + $adet")
    println("stokta var mı:  + $stoktaVarMi")
    println("birim fiyat:  + $birimFiyat")
    println("toplam:  + $araToplam")




}