import java.util.*

internal fun calcularDelta() {
    val scanner = Scanner(System.`in`)
    print("Digite o valor de A: ")
    val a = scanner.nextDouble()
    print("Digite o valor de B: ")
    val b = scanner.nextDouble()
    print("Digite o valor de C: ")
    val c = scanner.nextDouble()

    // Calcula o valor de Delta
    val delta = (b * b) - (4 * a * c)

    // Exibe o valor de Delta
    println("O valor de Delta é: $delta")
}

fun main() {
    calcularDelta()
}
