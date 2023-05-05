/*
Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
- Qual é a média de idade do grupo
- Quantas pessoas tem mais de 18 anos
- Quantas pessoas tem menos de 5 anos
- Qual foi a maior idade lida
 */

package org.example;

import java.util.Scanner;

public class Ex052 {

    public static void main(String[] args) {
        Ex052.main();
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int idade, somaIdades = 0, maiorIdade = 0, acimaDezoito = 0, abaixoCinco = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite a idade da %dª pessoa: ", i);
            idade = sc.nextInt();

            somaIdades += idade;

            if (idade > 18) {
                acimaDezoito++;
            }

            if (idade < 5) {
                abaixoCinco++;
            }

            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
        }

        double mediaIdades = somaIdades / 10.0;

        System.out.printf("A média de idades do grupo é de %.2f anos\n", mediaIdades);
        System.out.printf("Existem %d pessoas com mais de 18 anos\n", acimaDezoito);
        System.out.printf("Existem %d pessoas com menos de 5 anos\n", abaixoCinco);
        System.out.printf("A maior idade lida foi %d anos\n", maiorIdade);

        sc.close();
    }
}
