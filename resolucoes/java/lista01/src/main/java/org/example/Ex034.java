/*O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o 
indivíduo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida
*/

package org.example;

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
        Ex033.main();
    }
    public static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso em quilogramas: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade mórbida");
        }

        sc.close();
    }
}
