/*Uma empresa precisa reajustar o salário dos seus funcionários, dando um 
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, o gênero do funcionário e 
há quantos anos esse funcionário trabalha na empresa. No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
    - menos de 15 anos de empresa: +5%
    - de 15 até 20 anos de empresa: +12%
    - mais de 20 anos de empresa: +23%
- Homens
    - menos de 20 anos de empresa: +3%
    - de 20 até 30 anos de empresa: +13%
    - mais de 30 anos de empresa: +25% */

package org.example;

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
        Ex037.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual seu salário atual?: ");
        Float salario = sc.nextFloat();
        sc.nextLine(); // consome o caractere de quebra de linha
        System.out.print("Qual seu genero: ");
        String genero = sc.nextLine();
        System.out.print("Quantos anos voce trabalha na empresa?: ");
        int anos = sc.nextInt();
        if (genero.equals("feminino")) {
            if (anos < 15) {
                salario = salario + salario / 100 * 5;
            } else if (anos >= 15 && anos <= 20) {
                salario = salario + salario / 100 * 12;
            } else {
                salario = salario + salario / 100 * 23;

            }
        } else {
            if (anos < 15) {
                salario = salario + salario / 100 * 3;
            } else if (anos >= 15 && anos <= 20) {
                salario = salario + salario / 100 * 13;
            } else {
                salario = salario + salario / 100 * 25;

            }
        }
        System.out.printf("Seu salário aumentará para R$%.2f", salario);
        sc.close();
    }

}
