package basics

import java.util.*

/**
 * Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
 * entre eles.
 * Ex:
 * Digite um valor: 8
 * Digite outro valor: 5
 * A soma entre 8 e 5 é igual a 13.
 * */
fun ex04() {
    val scanner = Scanner(System.`in`)

    print("Digite um valor: ")
    val numero = scanner.nextInt()

    print("Digite outro valor: ")
    val numero2 = scanner.nextInt()

    val soma = numero + numero2

    print("A soma entre $numero e $numero2 é igual a ${soma}")
}

internal fun main() {
    ex04()
}
