/*

Faça um programa usando a estrutura “faça enquanto” que leia a idade de 
várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer ou não continuar a digitar dados. No final, quando o usuário decidir parar, mostre na tela:
- Quantas idades foram digitadas
- Qual é a média entre as idades digitadas
- Quantas pessoas tem 21 anos ou mais.

*/

package org.example;

import java.util.Scanner;

public class Ex062 {
    public static void main(String[] args) {
        Ex062.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int pessoasMaior21 = 0;
        int somaIdades = 0;
        do {
            contador++;
            System.out.printf("Qual idade da pessoa %d: ", contador);
            int idade = sc.nextInt();
            somaIdades += idade;
            if (idade >= 21) {
                pessoasMaior21++;
            }
            System.out.print("Deseja registra mais uma pessoa?: ");
            String resposta = sc.nextLine();
            if (resposta.equals("nao")) {
                break;
            }

        } while (true);
        System.out.printf("Foram digitadas %d idades%n", contador);
        System.out.printf("A média de idade é %.2f%n", (float) somaIdades / contador);
        System.out.printf("Há %d pessoas com 21 anos ou mais%n", pessoasMaior21);

        sc.close();
    }

}
/*
 * %n é usado para representar uma nova linha. Ele é útil para garantir que a
 * saída seja formatada corretamente, independentemente do sistema operacional.
 * 
 * %d é usado para representar um valor inteiro (decimal). É utilizado para
 * formatar a saída quando você deseja que um número inteiro seja apresentado de
 * forma legível.
 * 
 * %s é usado para representar uma string. É utilizado para formatar a saída
 * quando você deseja que uma string seja apresentada de forma legível.
 */