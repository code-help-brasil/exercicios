import java.text.NumberFormat
import java.util.*
import java.util.Locale.Builder
const val VALOR_DOLAR = 3.45


/**
 * Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
 * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 * */
fun ex009(){

    val usFormat = NumberFormat.getCurrencyInstance().apply {
        maximumFractionDigits = 2
        currency = Currency.getInstance(Locale.US)
    }

    val brFormat = NumberFormat.getCurrencyInstance().apply {
        maximumFractionDigits = 2
        currency = Currency.getInstance(Builder().setLanguage("pt").setRegion("BR").build())
    }

    val scanner =  Scanner(System.`in`)
    print("Quanto voce tem de dinheiro na conta? ")
    val money = scanner.nextDouble()
    println("Com ${brFormat.format(money)} você pode comprar ${usFormat.format(money / VALOR_DOLAR)}")
}

internal fun main(){
    ex009()
}