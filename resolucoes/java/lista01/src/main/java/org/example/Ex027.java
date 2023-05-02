/*Crie um programa que leia duas notas de um aluno e calcule a sua média, 
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO */

package org.example;

import java.util.Scanner;

public class Ex027 {
    public static void main(String[] args) {
        Ex027.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        Float nota1 = sc.nextFloat();
        System.out.print("Digite a segunda nota: ");
        Float nota2 = sc.nextFloat();
        Float media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 6.9 || media >= 5) {
            System.out.println("RECUPERAÇAO");
        } else {
            System.out.println("REPROVADO");
        }
        sc.close();

    }

}
