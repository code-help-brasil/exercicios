package basics

import java.math.BigDecimal
import java.util.Scanner

/**
 * Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
 * na tela a sua média na disciplina.
 * Ex:
 * Nota 1: 4,5
 * Nota 2: 8,5
 * A média entre 4,5 e 8,5 é igual a 6,5
 * */
fun ex05(){
    val scanner = Scanner(System.`in`)
    print("Nota 1: ")
    val nota1 = scanner.nextBigDecimal()
    print("Nota 2: ")
    val nota2 = scanner.nextBigDecimal()
    val media = (nota1 + nota2)/BigDecimal(2)
    print("A média entre $nota1 e $nota2 é igual a $media")
}


internal fun main() {
    ex05()
}
