
/*Crie um programa que leia o preço de um produto, calcule e mostre o seu 
PREÇO PROMOCIONAL, com 5% de desconto. */

package org.example;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Ex012.main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o preço do produto: R$");
        Float preco = sc.nextFloat();
        System.out.printf("O preço do produto com 5%% de desconto é R$%s", preco - preco / 100 * 5);
        sc.close();

    }

}
