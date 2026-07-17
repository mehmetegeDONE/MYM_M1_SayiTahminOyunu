package ders4

fun main() {
    /*
    ⭐ Geliştirici Bonus Görevi: Çökmez Karar Mekanizması

Sisteme kullanıcıların kendi notlarını dinamik olarak girebilecekleri gelişmiş bir denetim mekanizması ekliyoruz. Konsolda “Lütfen notunuzu girin:” sorusunu sorun ve değeri readln().toIntOrNull() ile yakalayın.

Çökme Koruması: Eğer kullanıcı “seksen” gibi bir harf veya boş bir değer girerse (yani veri null gelirse),
 programınız çökmek yerine “Lütfen notunuzu rakamlarla giriniz!” hatasını ekrana yazdırarak güvenle sonlansın.
Birinci Kontrol (if-Expression): Eğer geçerli bir sayı girildiyse, ilk olarak if expression (ifade) yöntemini
kullanarak öğrencinin sadece “Geçti” veya “Kaldı” (50 barajına göre) durumunu tek satırda belirleyip ekrana "Öğrenci Durumu: [Geçti/Kaldı]" şeklinde yazdırın.
İkinci Kontrol (Çoklu Karar Zinciri): Hemen ardından, if - else if - else zinciri kullanarak girilen nota göre
detaylı bir karne mesajı (Takdir Belgesi kazandınız, geçtiniz veya kaldınız bildirimi) üreterek konsola yazdırın.
Böylece hem kullanıcı hatalarına karşı çökmez (crash-proof) bir sistem, hem de iki farklı karar yapısının bir
arada çalıştığı profesyonel bir akış kurmuş olacaksınız!
     */

    print("Lütfen notunuzu giriniz: ")
    val not = readln().toIntOrNull()

    if (not == null){
        println("Lütfen notunuzu rakamlar ile giriniz!")
    } else if (not < 0 || not > 100 ){
        println("Not rakamı 0-100 arasında değil!")
    } else {
        val durum = if (not >= 50) "Geçti" else "Kaldı"

        if (not >= 85){
            println("Taktir Belgesi kazandınız")
        } else if (not >= 50){
            println("Tebrikler geçtiniz")
        } else{
            println("Kaldınız")
        }
        println(durum)
    }

}