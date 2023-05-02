/*Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos 
para todos, mas especialmente para mulheres. Faça um programa que leia nome, 
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo 
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto */

package org.example;

import java.util.Scanner;

public class Ex023 {
    public static void main(String[] args) {
        Ex023.main();
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o sexo do cliente (M/F): ");
        String sexo = sc.next();

        System.out.print("Informe o valor total das compras: ");
        double valorTotal = sc.nextDouble();

        double desconto;

        if (sexo.equalsIgnoreCase("M")) {
            // Homens ganham 5% de desconto
            desconto = valorTotal * 0.05;
        } else if (sexo.equalsIgnoreCase("F")) {
            // Mulheres ganham 13% de desconto
            desconto = valorTotal * 0.13;
        } else {
            System.out.println("Sexo inválido.");
            sc.close();
            return;
        }

        double valorComDesconto = valorTotal - desconto;

        System.out.printf("Valor total das compras: R$ %.2f\n", valorTotal);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Valor com desconto: R$ %.2f\n", valorComDesconto);

        sc.close();
        

    }

}
