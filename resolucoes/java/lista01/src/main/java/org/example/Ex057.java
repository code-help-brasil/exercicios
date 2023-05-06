/*
 Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários. 
No final, mostre o total de salários pagos aos homens e o total pago às 
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não 
sempre que ler os dados de um funcionário.
 */

package org.example;

import java.util.Scanner;

public class Ex057 {
    public static void main(String[] args) {
        Ex057.main();

    }

    public static void main() {

        Scanner sc = new Scanner(System.in);

        Float salarioMulher = Float.MIN_VALUE;
        Float salarioHomem = Float.MIN_VALUE;

        while (true) {
            System.out.print("Qual seu nome: ");

            String genero = sc.nextLine();

            System.out.print("Qual seu salario: ");

            Float salario = sc.nextFloat();

            if (genero.equals("feminino")) {
                salarioMulher += salario;
            } else {
                salarioHomem += salario;
            }

            System.out.print("Deseja continuar? (s/n): ");
            String resposta = sc.next();

            if (resposta.equals("n")) {
                break;
            }
            sc.nextLine();
        }
        System.out.printf("Total de salários pagos aos homens: R$%.2f\n", salarioHomem);
        System.out.printf("Total de salários pagos às mulheres: R$%.2f\n", salarioMulher);

        sc.close();

    }
}
