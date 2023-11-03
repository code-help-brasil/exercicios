import java.util.*

internal fun calcularNovoSalario() {
    val scanner = Scanner(System.`in`)
    print("Digite o salário do funcionário: ")
    val salario = scanner.nextDouble()

    // Calcula o valor do aumento
    val aumento = salario * 0.15
    // Calcula o novo salário
    val novoSalario = salario + aumento

    // Exibe o novo salário
    println("O novo salário é: R$${novoSalario}")
}

fun main() {
    calcularNovoSalario()
}
