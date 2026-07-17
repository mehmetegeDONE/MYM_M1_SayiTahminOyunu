package ders4

fun main() {
    /*
     Adım 1 – Yaş Kontrolü: Önce sadece yaşı kontrol edin. yas >= 18 ise ekrana “İşlemlere başlayabiliriz.” yazsın.
     Değilse (else), “Ehliyet almak için yaşınız yeterli değil.” mesajı yazdırın.
     */

    val yas = 17

    if (yas >= 18){
        println("İşlemlere başlayabiliriz.")
    } else{
        println("Ehliyet almak için yaşınız yeterli değil.")
    }
}