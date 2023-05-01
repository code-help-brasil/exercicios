/*Crie um algoritmo que leia o nome e as duas notas de um aluno,
 calcule a sua média e mostre na tela. No final, analise a média
e mostre se o aluno teve ou não um bom aproveitamento (se ficou acima da média 7.0). */

package org.example;

import java.util.Scanner;

public class Ex019 {
    public static void main(String[] args) {
        Ex019.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua a primeira nota: ");
        Float nota1 = sc.nextFloat();
        System.out.print("Digite sua a segunda nota: ");
        Float nota2 = sc.nextFloat();
        float media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.printf("Sua média foi %s,houve um bom aproveitamento",media);
        } else {
            System.out.printf("Sua média foi %s,houve um mal aproveitamento",media);
        }
        sc.close();

    }
}
