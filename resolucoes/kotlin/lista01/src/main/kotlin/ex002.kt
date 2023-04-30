import java.util.*

/**
 * Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
 * Ex:
 * Qual é o seu nome? João da Silva
 * Olá João da Silva, é um prazer te conhecer!
 * */
fun ex002(){
    val scanner = Scanner(System.`in`)
    print("Qual é o seu nome? ")
    val nome = scanner.nextLine()
    println("Olá $nome é um prazer te conhecer!")
}

internal fun main(){
    ex002()
}