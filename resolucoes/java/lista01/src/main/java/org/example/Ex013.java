/*Faça um algoritmo que leia o salário de um funcionário, 
calcule e mostre o seu novo salário, com 15% de aumento. */

package org.example;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Ex013.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o salário do funcionário?: R$");
        Float salario = sc.nextFloat();
        System.out.printf("O salário do funcionário com o aumento de 15%% é %s", salario + salario / 100 * 15);
        sc.close();

    }

}
