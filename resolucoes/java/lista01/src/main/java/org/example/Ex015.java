/* Crie um programa que leia o número de dias trabalhados
 em um mês e mostre o salário de um funcionário, 
 sabendo que ele trabalha 8 horas por dia e ganha R$25 por hora trabalhada*/

package org.example;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Ex015.main();

    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos dias de trabalho?: ");
        Integer dias = sc.nextInt();
        System.out.printf("O salário do trabalhador é R$%.2f", dias * 8 * 25);
        sc.close();

    }

}
