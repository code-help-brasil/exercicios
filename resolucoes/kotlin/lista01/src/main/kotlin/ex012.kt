import java.util.*

internal fun calcularPrecoPromocional() {
    val scanner = Scanner(System.`in`)
    print("Digite o preço do produto: ")
    val preco = scanner.nextDouble()

    // Calcula o valor do desconto
    val desconto = preco * 0.05
    // Calcula o preço promocional
    val precoPromocional = preco - desconto

    // Exibe o preço promocional
    println("O preço promocional é: R$${precoPromocional}")
}

fun main() {
    calcularPrecoPromocional()
}
