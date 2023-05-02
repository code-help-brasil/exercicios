/* Escreva um programa que pergunte a velocidade de um carro.
 Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário foi multado.
  Nesse caso, exiba o valor da multa, 
  cobrando R$5 por cada Km acima da velocidade permitida.*/

package org.example;

import java.util.Scanner;

public class Ex017 {

    public static void main(String[] args) {
        Ex017.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual é a velocidade do carro (Km/h) ?: ");
        float velocidade = sc.nextFloat();

        if (velocidade <= 80) {
            System.out.println("Velocidade dentro do limite");
        } else {
            System.out.println("Velocidade máxima atingida, Multado!");
            System.out.printf("Você irá pagar R$%.2f", (velocidade - 80) * 5);
        }

        sc.close();
    }
}
