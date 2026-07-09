package ders2.d122alistirmalar

fun main() {
    /*
    Market sepeti senaryonuzu geliştirin.
    Sepet tutarını tutan değişkeni var ile tanımlayın.
    Kullanıcının sepete yeni ürünler eklediğini varsayarak, sepet tutarını kod içinde iki kez güncelleyin (örneğin önce 50 TL, sonra 30 TL daha ekleyin).
    Her güncellemeden sonra yeni toplamı konsola yazdırın. Konsol çıktınızda en az üç farklı tutar satırı görmelisiniz.
    Bu, ileride modern ekran arayüzlerinin nasıl dinamik olarak güncelleneceğinin (Recomposition) temel mantığıdır!
    */

    val sepetTutari = 213
    val isim = "Ahmet"

    //prinf mantığı floatta aynı (format ile yazcan , yerine sona) diğer değişkenler direkt $ ile yapılıyor zaten.

    println("Sepet tutarı %s'nın şuanda $sepetTutari'dır!".format(isim))
}