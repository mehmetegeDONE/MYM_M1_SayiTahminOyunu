package ders3.alistirmalar

fun main() {
    /*
    Hava Durumu Spikeri:
    Kullanıcıdan yaşadığı şehri, bugünün en düşük ve en yüksek sıcaklık değerlerini girmesini isteyin.
    String şablonlarını kullanarak şu anons metnini oluşturun: "Burası [Şehir]. Bugün sıcaklık [Düşük] ile [Yüksek] derece arasında değişecek.
    Ortalama sıcaklık ise [Ortalama] derece." (Ortalamayı bulmak için iki değeri toplayıp ikiye bölebilirsiniz).
     */

    println("Yaşadığınız şehri girin: ")
    val yasadigiSehir = readln().uppercase()

    println("Yaşadığınız şehrin en dusuk sıcaklığını girin: ")
    val sehirDusukSicaklik = readln().toDouble()

    println("Yaşadığınız şehri en buyuk sıcaklığını girin: ")
    val sehirYuksekSicaklik = readln().toDouble()

    val ortalamaSicaklik = (sehirYuksekSicaklik + sehirDusukSicaklik) / 2

    println("Burası [$yasadigiSehir]. Bugün sıcaklık [$sehirDusukSicaklik] ile [$sehirYuksekSicaklik] " +
            "derece arasında değişecek. Ortalama sıcaklık ise [$ortalamaSicaklik] derece.")


}