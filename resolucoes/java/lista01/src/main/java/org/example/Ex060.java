/*
 Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas. 
 O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
- O nome da pessoa mais velha
- O nome da mulher mais jovem
- A média de idade do grupo
- Quantos homens tem mais de 30 anos
- Quantas mulheres tem menos de 18 anos
 */

package org.example;

import java.util.Scanner;

public class Ex060 {
    public static void main(String[] args) {
        Ex060.main();

    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        String nomeVelho = "";
        int idadeVelho = 0;
        String nomeMulherNova = "";
        int idadeMulherNova = 0;
        int totalIdades = 0;
        int numHomensMais30 = 0;
        int numMulheresMenos18 = 0;
        int numPessoas = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da pessoa: ");
            int idade = sc.nextInt();
            sc.nextLine(); // consumir a quebra de linha pendente
            System.out.print("Digite o sexo da pessoa (M ou F): ");
            char sexo = sc.nextLine().toUpperCase().charAt(0);

            if (idade > idadeVelho) {
                nomeVelho = nome;
                idadeVelho = idade;
            }

            if (sexo == 'F' && (idade < idadeMulherNova || idadeMulherNova == 0)) {
                nomeMulherNova = nome;
                idadeMulherNova = idade;
            }

            totalIdades += idade;
            numPessoas++;

            if (sexo == 'M' && idade > 30) {
                numHomensMais30++;
            }

            if (sexo == 'F' && idade < 18) {
                numMulheresMenos18++;
            }

            System.out.print("Deseja continuar? (S/N) ");
            char opcao = sc.nextLine().toUpperCase().charAt(0);
            if (opcao == 'N') {
                System.out.println("-=".repeat(30));
                break;
            }
        }

        float mediaIdades = (float) totalIdades / numPessoas;

        System.out.println("Nome da pessoa mais velha: " + nomeVelho);
        System.out.println("Nome da mulher mais nova: " + nomeMulherNova);
        System.out.println("Média de idade do grupo: " + mediaIdades);
        System.out.println("Número de homens com mais de 30 anos: " + numHomensMais30);
        System.out.println("Número de mulheres com menos de 18 anos: " + numMulheresMenos18);

        sc.close();
    }
}
