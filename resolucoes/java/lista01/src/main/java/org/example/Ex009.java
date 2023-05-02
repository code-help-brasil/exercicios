/*Faça um algoritmo que leia quanto dinheiro uma pessoa tem
 na carteira (em R$) e mostre quantos dólares ela pode comprar.
  Considere US$1,00 = R$3,45. */

package org.example;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Ex009.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto reais você tem na carteira?: R$");
        Float reais = sc.nextFloat();
        Double dolar = reais / 3.45;
        System.out.printf("Com R$%.2f voce pode comprar US$%.2f", reais, dolar);
        sc.close();

    }
}

