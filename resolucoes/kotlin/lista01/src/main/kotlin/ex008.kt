import java.util.Scanner

/**
 * Desenvolva um programa que leia uma distância em metros e mostre os valores
 * relativos em outras medidas.
 * Ex:
 * Digite uma distância em metros: 185,72
 * A distância de 85,7 m corresponde a:
 * 0,18572 km 1,8572 hm 18.572 dam
 * 1857,2 dm 18572,0 cm 185720,0 mm
 * */
fun ex008(){
    val scanner = Scanner(System.`in`)
    print("Digite uma distância em metros: ")
    val metros = scanner.nextDouble()
    print("""
    A distância de ${metros}m corresponde a:
    ${metros / 1000}km   ${metros / 100}hm     ${metros / 10}dam
    ${metros * 10}dm   ${metros * 100}cm   ${metros * 1000}mm
    """.trimIndent())
}

internal fun main(){
    ex008()
}
