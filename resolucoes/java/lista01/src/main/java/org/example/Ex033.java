/*Escreva um programa para aprovar ou não o empréstimo bancário para a compra de uma casa.
 O programa vai perguntar o valor da casa, o salário do comprador e em quantos anos ele vai pagar.
 Calcule o valor da prestação mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo será negado. */

package org.example;

import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
        Ex033.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da casa: ");
        double valorCasa = sc.nextDouble();

        System.out.print("Salário do comprador: ");
        double salario = sc.nextDouble();

        System.out.print("Quantos anos vai pagar: ");
        int anos = sc.nextInt();

        int meses = anos * 12;
        double prestacao = valorCasa / meses;

        if (prestacao <= salario * 0.3) {
            System.out.printf("Empréstimo aprovado. Valor da prestação: R$ %.2f%n", prestacao);
        } else {
            System.out.println("Empréstimo negado. Valor da prestação excede 30% do salário.");
        }

        sc.close();
    }
       
}
