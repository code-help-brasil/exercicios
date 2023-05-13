/* Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e 
guarde esses dados em três vetores. No final, mostre uma listagem contendo 
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil. */

package org.example;

import java.util.Scanner;

public class Ex085 {
    public static void main(String[] args) {
        Ex085.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        char[] sexos = new char[5];
        double[] salarios = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Funcionário " + (i + 1));
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            sexos[i] = sc.nextLine().charAt(0);

            System.out.print("Digite o salário: ");
            salarios[i] = sc.nextDouble();
            sc.nextLine();

            System.out.println();
        }
        System.out.print("---------Funcionárias que ganham mais de 5 mil----------");
        for (int i = 0; i < 5; i++) {
            if (salarios[i] > 5000 && Character.toString(sexos[i]).equals("F")) {
                System.out.print(nomes[i] + " ganha: " + salarios[i]);
            }
        }
        sc.close();

    }
}
