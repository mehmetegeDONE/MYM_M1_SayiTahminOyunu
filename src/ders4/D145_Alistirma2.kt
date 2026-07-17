package ders4

fun main() {
    /*
    📚 Adım 2 – Eğitim Şartı: && operatörünü kullanarak hem yaşın 18’den büyük
    veya eşit olmasını hem de egitimTamam değişkeninin true olmasını şart koşun.
    İkisi de sağlanıyorsa kayıt onayını veren kodu yazın.
     */

    val yas = 10
    val egitimTamam = true

    if (yas >= 18){
        println("Ehliyet almak için başvuru yapabilirsiniz!")

        if (egitimTamam){
            println("Kaydınız onaylandı.")
        } else{
            println("Kaydınız geçersiz.")
        }
    } else{
        println("Ehliyet yaşınızdan dolayı maalesef alamazsınız")
    }
}