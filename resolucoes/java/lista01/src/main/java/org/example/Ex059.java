/*
Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
- Qual é a maior idade lida
- Quantos homens foram cadastrados
- Qual é a idade da mulher mais jovem
- Qual é a média de idade entre os homens
 */
package org.example;

import java.util.Scanner;

public class Ex059 {
    public static void main(String[] args) {
        Ex059.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int maiorIdade = 0;
        int homens = 0;
        int mulherNova = 0;
        int somaHomens = 0;
        while (true) {

            System.out.print("Qual a idade da pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Qual sexo da pessoa: ");
            String genero = sc.nextLine();
            if (maiorIdade == 0) {
                maiorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }
            if (genero.equals("feminino")) {
                if (mulherNova == 0) {
                    mulherNova = idade;
                } else if (mulherNova > idade) {
                    mulherNova = idade;
                }

            } else {
                homens++;
                somaHomens += idade;
            }
            System.out.print("Deseja registrar mais pessoas? (sim ou nao): ");
            String resposta = sc.nextLine();
            if (resposta.equals("nao")) {
                break;
            }
        }

        System.out.printf("Maior idade lida: %d\n", maiorIdade);
        System.out.printf("Quantidade de homens cadastrados: %d\n", homens);
        System.out.printf("Idade da mulher mais jovem: %d\n", mulherNova);
        if (homens > 0) {
            float mediaIdadeHomens = (float) somaHomens / homens;
            System.out.printf("Média de idade entre os homens: %.2f\n", mediaIdadeHomens);
        }
        sc.close();
    }
}
