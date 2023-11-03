import java.util.*

internal fun calcularPrecoLocacao() {
    val scanner = Scanner(System.`in`)
    print("Digite a quantidade de Km percorridos: ")
    val kmPercorridos = scanner.nextDouble()
    print("Digite a quantidade de dias de locação: ")
    val diasLocacao = scanner.nextInt()

    // Define os preços por dia e por Km
    val precoDia = 90.0
    val precoKm = 0.20

    // Calcula o preço total
    val precoTotal = (precoDia * diasLocacao) + (precoKm * kmPercorridos)

    // Exibe o preço total a pagar
    println("O preço total a pagar é: R$${precoTotal}")
}

fun main() {
    calcularPrecoLocacao()
}
