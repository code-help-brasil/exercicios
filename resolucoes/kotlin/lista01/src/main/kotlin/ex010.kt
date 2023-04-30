import java.util.*

/**
 * Faça um algoritmo que leia a largura e altura de uma parede, calcule e
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
 * sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
 * */
internal fun ex010(){
    val scanner = Scanner(System.`in`)
    print("Digite a largura da parede: ")
    val largura = scanner.nextFloat()
    print("Digite a altura da parede: ")
    val altura = scanner.nextFloat()
    val area = largura * altura
    print("Com a area $area voce pode pintar um total de ${area/2}m2")
}

fun main(){
    ex010()
}