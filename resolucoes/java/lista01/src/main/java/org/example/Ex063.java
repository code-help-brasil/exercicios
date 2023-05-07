/*
 Crie um programa usando a estrutura “faça enquanto” que leia vários números. 
 A cada laço, pergunte se o usuário quer continuar ou não. 
 No final, mostre na tela:
- O somatório entre todos os valores
- Qual foi o menor valor digitado
- A média entre todos os valores
- Quantos valores são pares
 */

package org.example;

import java.util.Scanner;

public class Ex063 {
    public static void main(String[] args) {
        Ex063.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        int somaNumeros = 0;
        int contador = 0;
        int valor_pares = 0;
        int menor = 0;
        do {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            System.out.print("Deseja continuar (S/N): ");
            char resposta = sc.nextLine().toLowerCase().charAt(0);
            somaNumeros += numero;
            contador++;
            if (menor < numero) {
                menor = numero;
            }
            if (numero % 2 == 0) {
                valor_pares++;
            }
            if (resposta == 'n') {
                break;
            }
        } while (true);

        System.out.printf("O somatório de todos os valores é %d%n", somaNumeros);
        System.out.printf("O menor valor digitado foi %d%n", menor);
        System.out.printf("A média entre todos os valores é %.2f%n", (float) somaNumeros / contador);
        System.out.printf("O total de valores pares é %d%n", valor_pares);

        sc.close();

    }
}
