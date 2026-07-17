package ders4

/*
⚡ Adım 2 – Expression Kullanımı: Kotlin’in expression özelliğini kullanarak,
 sonucu doğrudan bir değişkene atayın (val durum = if (...) "Geçti" else "Kaldı")
 ve bu değişkeni sadece bir kez ekrana yazdırın.
 */

fun main() {
    val ortalama = 50
    val durum =
        if(ortalama >= 50){
            "Geçtiniz"
        } else {
            "Kaldınız"
        }

    println(durum)
}