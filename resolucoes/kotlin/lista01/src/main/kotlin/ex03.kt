package basics

import java.text.NumberFormat
import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*


/**
 * Crie um programa que leia o nome e o salário de um funcionário, mostrando uma mensagem no final.
 * Ex:
 * Nome do Funcionário: Maria do Carmo
 * Salário: 1850,45
 * O funcionário Maria do Carmo tem um salário de R$1850,45 em junho.
 */
fun ex03() {
    val scanner = Scanner(System.`in`)

    print("Nome do Funcionário: ")
    val nome = scanner.nextLine()

    print("Salário: ")
    val salario = scanner.nextBigDecimal()

    val brasil = Locale.Builder().setLanguage("pt").setRegion("BR").build()

    val mesFormatado = LocalDate.now().getMonth().getDisplayName(
        TextStyle.FULL, brasil
    )

    val salarioFormatado = NumberFormat.getCurrencyInstance().apply {
        maximumFractionDigits = 2
        currency = Currency.getInstance(brasil)
    }.format(salario)

    println(
        """
        Funcionário
        Nome: ${nome}
        Salário: ${salario}
        O funcionário(a) ${nome} tem um salário de ${salarioFormatado} em ${mesFormatado}
    """.trimIndent()
    )
}

internal fun main() {
    ex03()
}