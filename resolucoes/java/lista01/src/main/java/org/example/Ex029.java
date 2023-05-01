/*
 Desenvolva um programa que leia o nome de um funcionário, seu salário, 
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de 
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%
 */

package org.example;

import java.util.Scanner;

public class Ex029 {
    public static void main(String[] args) {
        Ex029.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual seu nome?: ");
        String name = sc.nextLine();
        System.out.printf("À quantos anos você trabalha na empresa?: ", name);
        int anos_trabalhados = sc.nextInt();
        System.out.print("Qual seu salário ");
        Float salario = sc.nextFloat();
        if (anos_trabalhados <= 3) {
            System.out.printf("Você terá um aumento de 3%%,assim seu salário será %.2f", 
                    salario - (salario / 100 * 3));
        } else if (anos_trabalhados > 3 && anos_trabalhados < 10) {
            System.out.printf("Você terá um aumento de 12.5%%,assim seu salário será %.2f",
                    salario - (salario / 100 * 12.5));
        } else {
            System.out.printf("Você terá um aumento de 20%%,assim seu salário será %.2f",
                    salario - (salario / 100 * 20));
        }
        sc.close();
    }

}
