import java.util.Scanner

/**
 * Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
 * sucessor.
 * Ex:
 * Digite um número: 9
 * O antecessor de 9 é 8
 * O sucessor de 9 é 10
 * */
fun ex006() {
    val scanner = Scanner(System.`in`)
    print("Digite um número: ")
    val number = scanner.nextInt()
    println(
        """
        O antecessor de $number é ${number - 1}
        O sucessor de $number é ${number + 1}
    """.trimIndent()
    )
}

internal fun main() {
    ex006()
}