import java.util.*

internal fun calcularSalario() {
    val scanner = Scanner(System.`in`)
    print("Digite o número de dias trabalhados: ")
    val diasTrabalhados = scanner.nextInt()

    // Define as informações sobre o salário
    val horasPorDia = 8
    val salarioPorHora = 25.0

    // Calcula o salário
    val salario = diasTrabalhados * horasPorDia * salarioPorHora

    // Exibe o salário do funcionário
    println("O salário do funcionário é: R$${salario}")
}

fun main() {
    calcularSalario()
}
