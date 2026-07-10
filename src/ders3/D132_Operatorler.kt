package ders3

fun main() {
    var sepetTutari = 120

    sepetTutari -= sepetTutari * 15 / 100

    println("sepetTutari = ${sepetTutari}")

    sepetTutari += 55

    println("sepetTutari sepet (kargo dahil) = ${sepetTutari}")
}